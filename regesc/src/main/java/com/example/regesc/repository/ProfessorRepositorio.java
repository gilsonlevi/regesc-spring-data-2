package com.example.regesc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.regesc.orm.Professor;

@Repository
public interface ProfessorRepositorio extends CrudRepository<Professor, Long>{
	
}
