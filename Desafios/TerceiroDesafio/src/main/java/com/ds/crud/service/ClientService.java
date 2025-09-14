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

    @Transactional
    public ClientDTO insert (ClientDTO dto){
        Client client = new Client();
        copyDtoToEntity(dto,client);
        client = repository.save(client);
        return new ClientDTO(client);
    }

    @Transactional()
    public ClientDTO update (Long id, ClientDTO dto){

        Client entity = repository.getReferenceById(id);
        copyDtoToEntity(dto, entity);
        return new ClientDTO(entity);


    }


    public void delete (Long id){
        repository.deleteById(id);
    }



    public void copyDtoToEntity (ClientDTO dto, Client entity){
        entity.setName(dto.getName());
        entity.setCpf(dto.getCpf());
        entity.setIncome(dto.getIncome());
        entity.setBirthDate(dto.getBirthDate());
        entity.setChildren(dto.getChildren());
    }


}
