package com.example.webflux.controller;

import com.example.springreactiveopenapicodegen.api.v1.BookApi;
import com.example.springreactiveopenapicodegen.dto.SuccessResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Collections;

@RestController
@RequestMapping("/api/v1")
public class BookController implements BookApi {
    @Override
    public Mono<ResponseEntity<SuccessResponseDTO>> getAllBook(ServerWebExchange exchange) {
        return Mono.just(
                ResponseEntity.ok()
                        .body(new SuccessResponseDTO(Collections.emptyList(), "ok"))
        );
    }
}
