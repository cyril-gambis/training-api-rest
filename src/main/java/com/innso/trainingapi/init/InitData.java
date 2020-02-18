package com.innso.trainingapi.init;

import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.innso.trainingapi.customerfile.CustomerFile;
import com.innso.trainingapi.customerfile.CustomerFileRepository;
import com.innso.trainingapi.interaction.Interaction;
import com.innso.trainingapi.interaction.InteractionRepository;
import com.innso.trainingapi.user.User;
import com.innso.trainingapi.user.UserRepository;

@Component
public class InitData implements CommandLineRunner {

	@Autowired
	private CustomerFileRepository customerFileRepository;
	
	@Autowired
	private InteractionRepository interactionRepository;

	@Autowired
	private UserRepository userRepository;
	
	@Override
	@Transactional
	public void run(String... args) throws Exception {
		
		CustomerFile customerFile = customerFileRepository.save(new CustomerFile("REF1", LocalDateTime.now()));
		
		interactionRepository.save(new Interaction("Bonjour, j'ai une question", LocalDateTime.now(), customerFile));
		interactionRepository.save(new Interaction("Oui, je vous écoute", LocalDateTime.now().plusMinutes(1), customerFile));

		customerFileRepository.findAll().forEach(System.out::println);
		interactionRepository.findAll().forEach(System.out::println);
		
		userRepository.save(new User("Madelyne Blitch"));
		
		userRepository.findAll().forEach(System.out::println);
	}
	
}
