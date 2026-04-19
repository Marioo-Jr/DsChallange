package com.devsuperior.uri2990;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.uri2990.dto.EmpregadoDeptDTO;
import com.devsuperior.uri2990.projections.EmpregadoDeptProjection;
import com.devsuperior.uri2990.repositories.EmpregadoRepository;

@SpringBootApplication
public class Uri2990Application implements CommandLineRunner {

	@Autowired
	private EmpregadoRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(Uri2990Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		System.out.println("\n*** RESULTADO SQL NOT IN ");
		List<EmpregadoDeptProjection> list1 =  repository.search1();
		List<EmpregadoDeptDTO> result1 = list1.stream().map(x -> new EmpregadoDeptDTO(x)).collect(Collectors.toList());

		for(EmpregadoDeptDTO obj : result1){

			System.out.println(obj);

		}

		System.out.println("\n*** RESULTADO JPQL ");

		List<EmpregadoDeptDTO> result2 = repository.search2();
		for(EmpregadoDeptDTO obj : result2){

			System.out.println(result2);

		}


		System.out.println("\n*** RESULTADO SQL LEFT JOIN ");
		List<EmpregadoDeptProjection> list3 =  repository.search3();
		List<EmpregadoDeptDTO> result3 = list3.stream().map(x -> new EmpregadoDeptDTO(x)).collect(Collectors.toList());

		for(EmpregadoDeptDTO obj : result3){

			System.out.println(obj);

		}
		
	}
}
