package br.bootcamp.citiesapi.countries.repositories;

import br.bootcamp.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
