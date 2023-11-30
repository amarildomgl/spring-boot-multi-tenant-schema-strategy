package edu.ucan.multitenantschema.repository;

import edu.ucan.multitenantschema.model.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PokemonRepository extends JpaRepository<Pokemon, UUID> {
}
