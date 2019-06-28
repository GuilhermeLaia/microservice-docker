package br.com.microservice.domain.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.microservice.domain.exception.ServiceException;
import br.com.microservice.domain.model.Model;
import br.com.microservice.domain.repository.ModelRepository;
import br.com.microservice.domain.service.IService;

@org.springframework.stereotype.Service
public class Service implements IService {

	@Autowired
	private ModelRepository modelRepository;
	
	@Override
	public Model getModel(Long id) throws ServiceException {
		Optional<Model> model = modelRepository.findById(id);
		if(model.isPresent()) {
			return model.get();
		}
		return null;
	}
	
}
