package br.bootcamp.citiesapi.countries.repositories;

import com.github.andrelugomes.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
