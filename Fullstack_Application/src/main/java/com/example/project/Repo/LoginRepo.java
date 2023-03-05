package com.example.project.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.Entity.LoginEntity;

public interface LoginRepo extends JpaRepository<LoginEntity, String> {

	

}
