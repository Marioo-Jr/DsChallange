package com.devsuperior.PrimeiroDesafio;

import com.devsuperior.PrimeiroDesafio.entities.Order;
import com.devsuperior.PrimeiroDesafio.services.OrderService;
import com.devsuperior.PrimeiroDesafio.services.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class PrimeiroDesafioApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroDesafioApplication.class, args);
	}

	@Autowired
	OrderService orderService;

	@Autowired
	ShippingService shippingService;


	@Override
	public void run(String... args) throws Exception {

		Order order1 = new Order(1034,150.00,20.0);
		System.out.println("Pedido código: "+ order1.getCode());
		System.out.println("Valor total: " + orderService.total(order1)+ "\n");



		Order order2 = new Order(2282,800.00,10.0);
		System.out.println("Pedido código: "+ order2.getCode());
		System.out.println("Valor total: " + orderService.total(order2)+ "\n");

		System.out.printf("");

		Order order3 = new Order(1309,95.90,0.0);
		System.out.println("Pedido código: "+ order3.getCode());
		System.out.println("Valor total: " + orderService.total(order3)+ "\n");




	}
}