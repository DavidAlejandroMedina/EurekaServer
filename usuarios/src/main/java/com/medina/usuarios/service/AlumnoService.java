package com.medina.usuarios.service;

import com.medina.usuarios.entity.Alumno;

import java.util.Optional;

public interface AlumnoService {
    
    public Iterable<Alumno> findAll();
    public Optional<Alumno> findById(Long id);
    public Alumno save(Alumno save);
    public void deleteById(Long id);
}
