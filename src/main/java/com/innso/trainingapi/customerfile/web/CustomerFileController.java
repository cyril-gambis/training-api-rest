package com.innso.trainingapi.customerfile.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.innso.trainingapi.customerfile.CustomerFileRepository;
import com.innso.trainingapi.interaction.InteractionRepository;

@RestController
@RequestMapping("/test")
public class CustomerFileController {

	@Autowired
	private CustomerFileRepository customerFileRepository;
	
	@Autowired
	private InteractionRepository interactionRepository;
	
	@GetMapping("/customerFiles")
	public ResponseEntity<?> test() {
		return ResponseEntity.ok(customerFileRepository.findAll());
	}
	
	@GetMapping("/interactions")
	public ResponseEntity<?> test2() {
		return ResponseEntity.ok(interactionRepository.findAll());
	}
	
}
