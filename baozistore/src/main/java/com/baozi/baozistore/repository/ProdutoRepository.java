package com.baozi.baozistore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.baozi.baozistore.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
