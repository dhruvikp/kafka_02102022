package com.simplilearn.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaReceiver {

	
	@KafkaListener(topics="SimplilearnTopic", groupId="grp_1")
	public void consume(String message) {
		System.out.println("Consumed message :"+message);
	}
	
	@KafkaListener(topics="SimplilearnTopic", groupId="grp_2")
	public void consume1(String message) {
		System.out.println("Consumed message $$$:"+message);
	}
}
