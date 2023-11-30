package edu.ucan.multitenantschema.controller;

import edu.ucan.multitenantschema.model.Pokemon;
import edu.ucan.multitenantschema.repository.PokemonRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    private final PokemonRepository pokemonRepository;

    public PokemonController(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    @GetMapping
    public ResponseEntity<List<Pokemon>> getAll() {
        return ResponseEntity.ok(
                this.pokemonRepository.findAll()
        );
    }

    @PostMapping
    public ResponseEntity<Pokemon> save(@RequestBody Pokemon pessoa) {
        return ResponseEntity.ok(
                this.pokemonRepository.save(pessoa)
        );
    }
}
