package com.alura.foroAlura.service;

import com.alura.foroAlura.model.Topicos;
import com.alura.foroAlura.repository.TopicoRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TopicoServiceImpl implements CRUD {

    private final TopicoRepositorio repositorio;
    private Integer id;

    @Override
    public List<Topicos> findAll() {
        return repositorio.findAll();
    }

    @Override
    public Topicos findByID(Integer id) {
        return null;
    }

    @Override
    public Topicos save(Topicos topicos) {
        return repositorio.findById(id).orElseThrow();
    }

    @Override
    public Topicos update(Integer id, Topicos topicos) {
        topicos.setId(id);
        return repositorio.save(topicos);
    }

    @Override
    public void deleteById(Integer id) {
        repositorio.deleteById(id);
    }
}