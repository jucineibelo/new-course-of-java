package com.devsuperior.aula;

import com.devsuperior.entities.Funcionario;
import com.devsuperior.services.ServiceSalario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class AulaApplication implements CommandLineRunner {

	@Autowired
	private ServiceSalario serviceSalario;

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Funcionario funcionario = new Funcionario("Jucão", 8630.0);
		System.out.println(serviceSalario.salarioLiquido(funcionario));
	}
}
