package com.example.demo.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "departamentos")
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long departamento_id;

    public String nombre;

    // Relación 1 a Muchos
    @OneToMany(mappedBy = "departamento")
    public List<Empleado> empleados;
}
