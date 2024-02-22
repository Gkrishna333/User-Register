package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dto.UserDTO;
import com.nt.entity.UserEntity;
import com.nt.repo.UserRepo;

@Service
public class UserServiceImple implements IUserService {

	@Autowired
	private UserRepo repo;

	@Override
	public UserDTO createUser(UserDTO userDTO) {
		UserEntity userEntity = UserEntity.builder().firstName(userDTO.getFirstName())
		.lastName(userDTO.getLastName())
		.email(userDTO.getEmail())
		.mobileNumber(userDTO.getMobileNumber()).build();
		
		UserEntity save = repo.save(userEntity);
		
		UserDTO userDTO2 = userDTO.builder()
		.firstName(save.getFirstName())
		.lastName(save.getLastName())
		.email(save.getEmail())
		.mobileNumber(save.getMobileNumber()).
		id(save.getId())
		.build();
		
		return userDTO2;
	}
}
