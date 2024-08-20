package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.SampleProject;

public interface SampleProjectRepository extends JpaRepository<SampleProject, Integer> {
	List<SampleProject> findByUserName(String userName);
}

