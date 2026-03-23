package com.example.balloons_now_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.balloons_now_rest.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
