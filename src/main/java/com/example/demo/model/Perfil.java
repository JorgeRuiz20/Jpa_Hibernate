package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "perfiles")
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long perfil_id;

    public String biografia;
    public String telefono;
}
