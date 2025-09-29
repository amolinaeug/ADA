package com.preverisk.ada.spring.mf0493.entidades;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "visitas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Visita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    @Size(min = 3, max = 50)
    private String hotelName;

    @NotNull
    @NotBlank
    @Size(min = 3, max = 50)
    private String auditorName;

    @NotNull
    private LocalDateTime scheduledDate;

    @NotNull
    @Size(min = 3, max = 20)
    private String status;

    @Lob
    @Size(max = 2000)
    private String comentarios;
}
