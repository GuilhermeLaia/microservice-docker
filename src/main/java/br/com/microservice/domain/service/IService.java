package br.com.microservice.domain.service;

import br.com.microservice.domain.exception.ServiceException;
import br.com.microservice.domain.model.Model;

public interface IService {
	
	public Model getModel(Long id) throws ServiceException;
	
}
