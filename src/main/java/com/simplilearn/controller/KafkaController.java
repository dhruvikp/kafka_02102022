package com.simplilearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.service.KafkaPublisher;

@RestController
public class KafkaController {

	@Autowired
	KafkaPublisher publisher;

	@GetMapping("/produce")
	public String producer(@RequestParam("message") String message) {
		publisher.send(message);
		return "message published successfully";
	}
}
