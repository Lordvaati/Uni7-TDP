package com.example.tecnicasvf.repository;

import com.example.tecnicasvf.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public class ClienteRepository extends JpaRepository<Cliente, Integer> {

    Cliente findById(Integer id);
}
