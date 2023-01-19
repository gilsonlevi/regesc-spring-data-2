package com.example.regesc;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.regesc.orm.Professor;
import com.example.regesc.repository.ProfessorRepositorio;
import com.example.regesc.service.CrudProfessorService;

@SpringBootApplication
public class RegescApplication implements CommandLineRunner{
	private CrudProfessorService professorService;
	
	public RegescApplication(CrudProfessorService professorService) {
		this.professorService = professorService;
	}
	public static void main(String[] args) {
		SpringApplication.run(RegescApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Boolean isTrue = true;
		Scanner teclado = new Scanner(System.in);
		while(isTrue) {
			System.out.println("Qual entidade você deseja interagir?");
			System.out.println("0. Sair do programa");
			System.out.println("1. Professor");
			int opcao = teclado.nextInt();
			
			if(opcao == 0) {
				System.out.println("Saindo do programa...");
				break;
			}else if (opcao == 1) {
				this.professorService.menu(teclado);
			}
		}
	}

}
