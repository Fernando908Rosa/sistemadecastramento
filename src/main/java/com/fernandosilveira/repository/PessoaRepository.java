package com.fernandosilveira.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fernandosilveira.entityes.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}


