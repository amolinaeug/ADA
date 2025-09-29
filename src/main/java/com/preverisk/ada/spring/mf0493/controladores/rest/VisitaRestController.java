package com.preverisk.ada.spring.mf0493.controladores.rest;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.preverisk.ada.spring.mf0493.entidades.Visita;
import com.preverisk.ada.spring.mf0493.servicios.VisitaService;



@CrossOrigin(origins = "http:localhost:8081")
@RestController
public class VisitaRestController {
	@Autowired
	private VisitaService servicio;
	
	@GetMapping
	public Iterable<Visita> listadoPorHotel() {
		return servicio.buscarPorHotel(null);
	}

}



