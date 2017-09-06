package com.pioneerlabs.app.messages;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/messages")
@AllArgsConstructor
public class MessageController {
	private final MessageService messageService;

	@GetMapping
	ResponseEntity<Message> randomMessage() {
		return ResponseEntity.ok(messageService.generateRandom());
	}
}