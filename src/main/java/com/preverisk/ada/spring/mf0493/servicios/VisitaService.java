package com.preverisk.ada.spring.mf0493.servicios;


import com.preverisk.ada.spring.mf0493.entidades.Visita;


public interface VisitaService {
	
	Iterable<Visita> buscarPorHotel(String hotelName);
}
