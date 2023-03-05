package com.example.project.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.Entity.SignupEntity;

public interface SignupRepo extends JpaRepository<SignupEntity, Integer> {
	
}
