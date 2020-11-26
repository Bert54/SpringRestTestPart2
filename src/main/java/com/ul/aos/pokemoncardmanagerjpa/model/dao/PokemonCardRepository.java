package com.ul.aos.pokemoncardmanagerjpa.model.dao;

import com.ul.aos.pokemoncardmanagerjpa.model.objects.PokemonCard;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface PokemonCardRepository extends CrudRepository<PokemonCard, Integer> {

    Iterable<PokemonCard> findAll();

    PokemonCard findById(int id);

    @Query("SELECT pc FROM PokemonCard pc WHERE pc.name = :pcname AND pc.type = :pctype")
    Iterable<PokemonCard> find(@Param("pcname") String name, @Param("pctype") String type);

    PokemonCard save(PokemonCard card);

    @Transactional
    @Modifying
    PokemonCard deleteById(int id);

    @Transactional
    @Modifying
    @Query("DELETE FROM PokemonCard pc WHERE pc.name = :pcname AND pc.type = :pctype")
    PokemonCard delete(@Param("pcname") String name, @Param("pctype") String type);

}
