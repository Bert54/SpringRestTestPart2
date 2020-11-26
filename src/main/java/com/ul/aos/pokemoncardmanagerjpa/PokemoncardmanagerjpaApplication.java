package com.ul.aos.pokemoncardmanagerjpa;

import com.ul.aos.pokemoncardmanagerjpa.model.dao.PokemonCardRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PokemoncardmanagerjpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PokemoncardmanagerjpaApplication.class, args);
    }

}
