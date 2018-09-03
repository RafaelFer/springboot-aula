package br.com.estudo.springboot.repository;

import br.com.estudo.springboot.model.Convidado;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by rafaelsantos on 03/09/2018.
 */

public interface ConvidadoRepository extends CrudRepository<Convidado, Long> {
}
