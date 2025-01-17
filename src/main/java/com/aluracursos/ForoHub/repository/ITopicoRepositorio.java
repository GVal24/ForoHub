package com.aluracursos.ForoHub.repository;

import com.aluracursos.ForoHub.modelos.Topicos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITopicoRepositorio extends JpaRepository<Topicos, Integer> {
}
