package com.example.tecnicasvf.controller;

import com.example.tecnicasvf.model.Cliente;
import com.example.tecnicasvf.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ClienteController {
    private final ClienteService clienteService;

    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @ResponseBody
    @RequestMapping(value = "cliente", method = RequestMethod.POST)
    public Cliente create(@RequestBody Cliente clientes) {
        return clienteService.create(clientes);
    }

    @ResponseBody
    @RequestMapping(value = "cliente", method = RequestMethod.GET)
    public List<Cliente> list() {
        return clienteService.list();
    }

    @ResponseBody
    @RequestMapping(value = "cliente/{id}", method = RequestMethod.GET)
    public Cliente FindById(@PathVariable Integer id) {
        return clienteService.findById(id);
    }

    @ResponseBody
    @RequestMapping(value = "cliente/{id}", method = RequestMethod.PUT)
    public Cliente update(@PathVariable Integer id, @RequestBody Cliente cliente) {
        cliente.setId(id);
        return clienteService.update(cliente);

    }

    @ResponseBody
    @RequestMapping("cliente/{id}")
    public void remove(@PathVariable Integer id) {
        clienteService.remove(id);

    }
}
