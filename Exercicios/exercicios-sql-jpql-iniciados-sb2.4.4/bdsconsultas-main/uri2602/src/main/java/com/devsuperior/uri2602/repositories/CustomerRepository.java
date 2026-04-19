package com.devsuperior.uri2602.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.uri2602.DTO.CustomerMinDTO;
import com.devsuperior.uri2602.entities.Customer;
import com.devsuperior.uri2602.projections.CustomerMinProjection;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query(nativeQuery = true, value =
        "SELECT name " +
        "FROM customers " +
        "WHERE UPPER(state) = UPPER(:state) ") // consulta no modo sql e nao jpql
    List<CustomerMinProjection> search1(String state);


    @Query(//jpql
        "SELECT new com.devsuperior.uri2602.DTO.CustomerMinDTO(obj.name)  " +
        "FROM Customer obj " +  // Customer = nome da classe Java, não da tabela "customers"
        "WHERE UPPER(obj.state) = UPPER(:state)") // consulta no modo sql e nao jpql
    List<CustomerMinDTO> search2(String state);

}
