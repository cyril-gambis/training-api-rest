package com.innso.trainingapi.interaction;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.innso.trainingapi.customerfile.CustomerFile;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Interaction {

	@Id
	@GeneratedValue
	private Long id;
	
	private String content;
	
	private LocalDateTime creationDateTime;

	@ManyToOne
	private CustomerFile customerFile;
	
	public Interaction(String content, LocalDateTime creationDateTime, CustomerFile customerFile) {
		this.content = content;
		this.creationDateTime = creationDateTime;
		this.customerFile = customerFile;
	}

}
