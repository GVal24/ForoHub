package com.aluracursos.ForoHub.services;

import com.aluracursos.ForoHub.modelos.Topicos;

import java.util.List;

public interface Icrud {
    // Metodo GET
    List<Topicos> findAll();
    Topicos findByID(Integer id);

    // Metodo POST
    Topicos save(Topicos topicos);

    //Metodo PUT
    Topicos update(Integer id, Topicos topicos);

    //Metodo DELETE
    void deleteById(Integer id);

}

