package com.preverisk.ada.spring.mf0493.servicios;

import com.preverisk.ada.spring.mf0493.entidades.Visita;

public interface VisitaAdminService {
	Visita alta(Visita visita);
	Iterable<Visita> listado();
}
