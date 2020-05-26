package com.facturacion.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.facturacion.model.Factura;
import com.facturacion.repo.IFacturaRepo;
import com.facturacion.service.IFacturaService;

public class FacturaServiceImpl implements IFacturaService {

	@Autowired
	private IFacturaRepo repo; 
	
	@Override
	public Factura registrar(Factura obj) {
		return repo.save(obj);
	}
	
	@Override
	public Factura modificar(Factura obj) {
		return repo.save(obj);
	}
	
	@Override
	public List<Factura> listar(){
		return repo.findAll();
	}
	
	@Override
	public Factura leerPorId(Integer id) {
		Optional<Factura> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Factura();
	}
	
	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}
	
}
