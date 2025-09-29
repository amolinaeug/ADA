package com.preverisk.ada.spring.mf0493.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.preverisk.ada.spring.mf0493.entidades.Visita;
import com.preverisk.ada.spring.mf0493.repositorios.VisitaRepository;

@Service
public class VisitaServiceImpl implements VisitaService {
	@Autowired
	private VisitaRepository repo;

	@Override
	public Iterable<Visita> buscarPorHotel(String hotelName) {
		 if (hotelName == null || hotelName.isEmpty()) {
		        return null; 
		    }
		      return repo.findByHotelNameContaining(hotelName);
		    }
}
