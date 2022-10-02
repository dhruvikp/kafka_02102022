package com.simplilearn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaPublisher {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public void send(String message) {
		kafkaTemplate.send("SimplilearnTopic",message);
	}
}
