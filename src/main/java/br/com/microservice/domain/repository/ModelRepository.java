package br.com.microservice.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.microservice.domain.model.Model;

@Repository
public interface ModelRepository extends CrudRepository<Model, Long>  {

	
}
