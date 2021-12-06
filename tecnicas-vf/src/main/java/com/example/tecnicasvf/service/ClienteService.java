package com.example.tecnicasvf.service;

import com.example.tecnicasvf.model.Cliente;
import com.example.tecnicasvf.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente create(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> list(){
        return clienteRepository.findAll();
    }

    public Cliente findById(Integer id){
        return clienteRepository.findById(id).get();
    }

    public Cliente update(Cliente cliente){
        clienteRepository.save(cliente);
        return cliente;
    }

    public void remove(Integer id){
        clienteRepository.deleteById(id);
    }

}