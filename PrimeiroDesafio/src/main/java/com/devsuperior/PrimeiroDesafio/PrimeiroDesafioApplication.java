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

		Order order = new Order(1034,20.0,150.0);
		//OrderService orderService = new OrderService();   -> pq da erro quando eu crio o construtor do orderservice???

		System.out.println("Pedido código: "+ order.getCode());
		System.out.println("Valor total: " + orderService.total(order));


	}
}