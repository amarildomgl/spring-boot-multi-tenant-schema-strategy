package edu.ucan.multitenantschema.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "pokemon")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pokemon_pk")
    private UUID pokemonId;

    @Column(name = "name")
    private String name;
}
