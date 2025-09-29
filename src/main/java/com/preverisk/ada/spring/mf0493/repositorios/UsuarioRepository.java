package com.preverisk.ada.spring.mf0493.repositorios;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.preverisk.ada.spring.mf0493.entidades.Usuario;


@RepositoryRestResource(path ="usuarios", collectionResourceRel = "usuarios")
public interface UsuarioRepository extends PagingAndSortingRepository<Usuario, Long> {
}
