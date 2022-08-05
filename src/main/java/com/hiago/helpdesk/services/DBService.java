package com.hiago.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiago.helpdesk.domain.Chamado;
import com.hiago.helpdesk.domain.Cliente;
import com.hiago.helpdesk.domain.Tecnico;
import com.hiago.helpdesk.domain.enums.Perfil;
import com.hiago.helpdesk.domain.enums.Prioridade;
import com.hiago.helpdesk.domain.enums.Status;
import com.hiago.helpdesk.repositories.ChamadoRepository;
import com.hiago.helpdesk.repositories.ClienteRepository;
import com.hiago.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public void instanciaDB() {
		
		Tecnico tec1 = new Tecnico(null,"Hiago Luli", "11735910015", "hiago@email.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Linus Torvalds", "85442901083", "linus@email.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1, cli1); 
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}

}
