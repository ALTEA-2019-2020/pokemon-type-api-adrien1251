package com.miage.altea.tp.pokemon_type_api.service;

import com.miage.altea.tp.pokemon_type_api.bo.PokemonType;

import java.util.List;

public interface PokemonTypeService {
    PokemonType getPokemonFromId(int id);
    PokemonType getPokemonTypeFromName(String name);
    List<PokemonType> getPokemonTypeFromType(List<String> type);
    List<PokemonType> getAllPokemonTypes();
}

