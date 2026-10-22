package com.example.demo.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long curso_id;

    public String titulo;

    // Relación Muchos a Muchos
    @ManyToMany(mappedBy = "cursos")
    public List<Estudiante> estudiantes;
}
