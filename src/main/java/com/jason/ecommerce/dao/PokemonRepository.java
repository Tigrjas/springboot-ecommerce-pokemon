package com.jason.ecommerce.dao;

import com.jason.ecommerce.entity.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
}
