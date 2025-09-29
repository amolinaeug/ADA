package com.preverisk.ada.spring.mf0493.repositorios;

import java.time.LocalDateTime;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.preverisk.ada.spring.mf0493.entidades.Visita;

@Repository
public interface VisitaRepository extends CrudRepository<Visita, Long> {
    
    Iterable<Visita> findByHotelNameContaining(String hotelName);

    Iterable<Visita> findByScheduledDate(LocalDateTime date);
    Iterable<Visita> findByScheduledDateBetween(LocalDateTime start, LocalDateTime end);

    Iterable<Visita> findByAuditorNameContaining(String auditorName);

    Iterable<Visita> findByStatus(String status);
    
    Iterable<Visita> findByComentariosContaining(String comentarios);

}
