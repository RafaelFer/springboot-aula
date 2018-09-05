package br.com.estudo.springboot.repository;

import br.com.estudo.springboot.model.Convidado;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by rafaelsantos on 03/09/2018.
 */

public interface ConvidadoRepository extends CrudRepository<Convidado, Long> {

    List<Convidado> findByNome(String nome);

}
