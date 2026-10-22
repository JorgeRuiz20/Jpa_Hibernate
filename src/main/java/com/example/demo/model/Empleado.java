package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long empleado_id;

    public String nombre;
    public String puesto;

    // Relación Muchos a 1
    @ManyToOne
    @JoinColumn(name = "departamento_id")
    public Departamento departamento;
}
