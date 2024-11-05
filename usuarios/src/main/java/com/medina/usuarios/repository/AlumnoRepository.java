package com.medina.usuarios.repository;

import com.medina.usuarios.entity.Alumno;
import org.springframework.data.repository.CrudRepository;

public interface AlumnoRepository extends CrudRepository <Alumno, Long> {
}
