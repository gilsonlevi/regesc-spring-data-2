package com.example.regesc.service;

import java.util.Scanner;

import org.springframework.stereotype.Service;

import com.example.regesc.orm.Professor;
import com.example.regesc.repository.ProfessorRepositorio;

@Service
public class CrudProfessorService {
	private	ProfessorRepositorio professorRepositorio;
	
	public CrudProfessorService(ProfessorRepositorio professorRepositorio) {
		this.professorRepositorio = professorRepositorio;
	}
	
	
	
	public void menu(Scanner teclado) {
		Boolean isTrue = true;
		
		while(isTrue) {
			System.out.println("Qual ação você que executar?");
			System.out.println("0. Voltar ao menu anterior");
			System.out.println("1. Cadastrar novo Professor");
			int opcao = teclado.nextInt();
			teclado.nextLine();
			
			if(opcao == 0) {
				break;
			}else if (opcao == 1) {
				cadastrar(teclado);
			}
		}
	}
	
	private void cadastrar(Scanner teclado) {
		System.out.println("Digite o nome do professor: ");
		String nome = teclado.nextLine();
		
		System.out.println("Digite o prontuario do professor: ");
		String prontuario = teclado.nextLine();
		
		Professor professor = new Professor(nome, prontuario);
		this.professorRepositorio.save(professor);
		
		System.out.println("Professor salvo no banco");
	}
	
}