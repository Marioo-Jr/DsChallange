package com.ds.crud.service;


import com.ds.crud.dto.ClientDTO;
import com.ds.crud.entities.Client;
import com.ds.crud.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.apache.tomcat.util.net.openssl.OpenSSLStatus.setName;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;


    @Transactional(readOnly = true)
    public ClientDTO findById(Long id){
        Client client = repository.findById(id).get();
        return new ClientDTO(client);

    }

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAll(Pageable pageable){
        Page<Client> result = repository.findAll(pageable);
        return result.map(x -> new ClientDTO(x));

    }

//    public void copyDtoToEntity (ClientDTO dto, Client entity){
//        entity = setName(dto.getName());
//        name = entity.getNamee();
//        cpf = entity.getCpf();
//        income = entity.getIncome();
//        birthDate = entity.getBirthDate();
//        children = entity.getChildren();
//
//
//    }


}
