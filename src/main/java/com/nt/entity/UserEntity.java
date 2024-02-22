package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	private String mobileNumber;
}
