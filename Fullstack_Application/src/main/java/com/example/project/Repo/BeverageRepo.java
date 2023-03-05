package com.example.project.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.Entity.BeverageEntity;

public interface BeverageRepo extends JpaRepository<BeverageEntity, Integer> {

}
