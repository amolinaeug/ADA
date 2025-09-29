package com.preverisk.ada.spring.mf0493.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.preverisk.ada.spring.mf0493.entidades.Visita;

import com.preverisk.ada.spring.mf0493.repositorios.VisitaRepository;

@Service
public class VisitaAdminServiceImpl implements VisitaAdminService {

	@Autowired
	private VisitaRepository repo;
	
	@Override
	public Visita alta(Visita visita) {
		return repo.save(visita);
		
	}

	@Override
	public Iterable<Visita> listado() {
		return repo.findAll();
		
	}
}
