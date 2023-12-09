package com.jason.ecommerce.dao;

import com.jason.ecommerce.entity.PokemonCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "pokemonCategory", path = "pokemon-category")
@CrossOrigin("http://localhost:4200")
public interface PokemonCategoryRepository extends JpaRepository<PokemonCategory, Long> {
}
