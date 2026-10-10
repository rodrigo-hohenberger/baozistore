package com.baozi.baozistore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.baozi.baozistore.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
