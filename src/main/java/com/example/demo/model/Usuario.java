package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long usuario_id;

    public String nombre;
    public String email;

    // Relación 1 a 1
    @OneToOne
    @JoinColumn(name = "perfil_id")
    public Perfil perfil;
}
