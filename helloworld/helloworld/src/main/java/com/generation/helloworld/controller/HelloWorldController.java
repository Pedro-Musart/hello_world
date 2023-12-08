package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World";
	}
	@GetMapping("/bsmGeneration")
	public String bsmGeneration() {
		return "Persistência;\r\n"
				+ "Mentalidade de Crescimento;\r\n"
				+ "Responsabilidade Pessoal;\r\n"
				+ "Orientação ao Futuro;\r\n"
				+ "Proatividade;\r\n"
				+ "Comunicação;\r\n"
				+ "Trabalho em Equipe;\r\n"
				+ "Orientação ao Detalhe;";  	
	}
	@GetMapping("/objetivos")
	public String objetivos() {
		return "Meus objetivos esta semana incluem:\n"
+ "1 - Me aprofundar nos conceitos de arquitetura de redes e entender melhor o protocolo HTTP para comunicação entre aplicações\n" 
+ "2 - Me aprofundar nos conceitos que giram em torno de API\n"
+ "3 - Reforçar todo estudo dessa semana sobre a construção de um bom backend";
	}
	

}
