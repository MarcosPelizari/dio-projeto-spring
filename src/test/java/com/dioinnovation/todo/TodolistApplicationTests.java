package com.dioinnovation.todo;

import com.dioinnovation.todo.entity.Todo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebFlux;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TodolistApplicationTests {

	@Autowired
	private WebTestClient webTestClient;

	@Test
	void testCreateSucess() {
		Todo todo = new Todo("todo 1", "desc todo 1", false, 1);

		webTestClient.post()
				.uri("/todos")
				.bodyValue(todo)
				.exchange()
				.expectStatus().isOk()
				.expectBody()
				.jsonPath("$").isArray()
				.jsonPath("$.length()").isEqualTo(1)
				.jsonPath("$[0].nome").isEqualTo(todo.getNome())
				.jsonPath("$[0].descricao").isEqualTo(todo.getDescricao())
				.jsonPath("$[0].checklist").isEqualTo(todo.isChecklist())
				.jsonPath("$[0].prioridade").isEqualTo(todo.getPrioridade());
	}

	@Test
	void testCreateFail() {
		webTestClient
				.post()
				.uri("/todos")
				.bodyValue(new Todo("", "", false, 0))
				.exchange()
				.expectStatus().isBadRequest();
	}
}
