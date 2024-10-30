package com.corhuila.carrito.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario extends ABaseEntity{

    @Column(name = "usuario", length = 50, nullable = false)
    private String usuario;

    @Column(name = "contrasenia", length = 50, nullable = false)
    private String contrasenia;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "persona_id", nullable = false, unique = true)
    private Persona personaId;
}
