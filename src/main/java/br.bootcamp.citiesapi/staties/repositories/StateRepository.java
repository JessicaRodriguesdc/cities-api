package br.bootcamp.citiesapi.staties.repositories;

import br.bootcamp.citiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
