package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Integer> {

}
