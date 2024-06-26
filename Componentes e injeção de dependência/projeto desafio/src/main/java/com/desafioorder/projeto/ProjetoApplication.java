package com.desafioorder.projeto;

import com.desafioorder.projeto.entities.Order;
import com.desafioorder.projeto.services.ServiceCalculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
@ComponentScan({"com.desafioorder"})
public class ProjetoApplication implements CommandLineRunner {

	@Autowired
	ServiceCalculo serviceCalculo;

	public static void main(String[] args) {
		SpringApplication.run(ProjetoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("código:");
		int codigo = sc.nextInt();
		System.out.println("valor básico");
		double valorBasico = sc.nextDouble();
		System.out.println("porcentagem de desconto");
		double desconto = sc.nextDouble();

		Order order = new Order(codigo, valorBasico, desconto);
		System.out.println(serviceCalculo.total(order));


	}
}
