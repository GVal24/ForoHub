package com.aluracursos.ForoHub.services;

import com.aluracursos.ForoHub.modelos.Topicos;
import com.aluracursos.ForoHub.repository.ITopicoRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class TopicoServiceImplementation {

        private ITopicoRepositorio repositorio;
        private Integer id;


        public List<Topicos> findAll() {
            return repositorio.findAll();
        }


        public Topicos findByID(Integer id) {
            return null;
        }


        public Topicos save(Topicos topicos) {
            return repositorio.findById(id).orElseThrow();
        }


        public Topicos update(Integer id, Topicos topicos) {
            topicos.setId(id);
            return repositorio.save(topicos);
        }


        public void deleteById(Integer id) {
            repositorio.deleteById(id);
        }
}
