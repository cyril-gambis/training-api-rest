package com.innso.trainingapi.customerfile;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class CustomerFile {

	@Id
	@GeneratedValue
	private Long id;
	
	private String ref;
	
	private LocalDateTime openingDateTime;
	
	public CustomerFile(String ref, LocalDateTime openingDateTime) {
		this.ref = ref;
		this.openingDateTime = openingDateTime;
	}
	
}
