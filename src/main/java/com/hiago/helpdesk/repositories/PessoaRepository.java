package com.hiago.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hiago.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
