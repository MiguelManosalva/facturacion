package com.facturacion.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.facturacion.model.Categoria;
import com.facturacion.repo.ICategoriaRepo;
import com.facturacion.service.ICategoriaService;

public class CategoriaServiceImpl implements ICategoriaService {
	
	@Autowired
	private ICategoriaRepo repo; 
	
	@Override
	public Categoria registrar(Categoria obj) {
		return repo.save(obj);
	}
	
	@Override
	public Categoria modificar(Categoria obj) {
		return repo.save(obj);
	}
	
	@Override
	public List<Categoria> listar(){
		return repo.findAll();
	}
	
	@Override
	public Categoria leerPorId(Integer id) {
		Optional<Categoria> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Categoria();
	}
	
	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}

}
