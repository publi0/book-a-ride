package br.com.cadastrocorridas.repository;

import br.com.cadastrocorridas.domain.Motorista;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotoristaRepository extends CrudRepository<Motorista, Integer> {
}
