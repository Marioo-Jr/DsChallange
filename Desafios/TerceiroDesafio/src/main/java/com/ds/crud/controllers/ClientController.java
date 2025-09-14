package com.ds.crud.controllers;


import com.ds.crud.dto.ClientDTO;
import com.ds.crud.service.ClientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<ClientDTO> findById (@PathVariable Long id){

        ClientDTO dto = clientService.findById(id);
        return ResponseEntity.ok(dto);

    }

    @GetMapping
    public ResponseEntity<Page<ClientDTO>> findAll(Pageable pageable){

        Page<ClientDTO> dto = clientService.findAll(pageable);
        return ResponseEntity.ok(dto);

    }
    @PostMapping
    public ResponseEntity<ClientDTO> insert (@Valid @RequestBody ClientDTO dto){
        dto = clientService.insert(dto);
        return ResponseEntity.ok(dto);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ClientDTO> update (@PathVariable long id,@Valid @RequestBody ClientDTO dto){

        dto = clientService.update(id,dto);
        return ResponseEntity.ok(dto);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete (@PathVariable Long id){
        clientService.delete(id);
        return ResponseEntity.noContent().build();
    }


}
