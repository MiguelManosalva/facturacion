package com.facturacion.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.facturacion.model.Categoria;

public class ICategoriaRepo extends JpaRepository<Categoria, Integer> {
	
	@Modifying 
	@Query(value = "INSERT INTO categoria(id_categoria, nombre, descripcion) VALUES (:idCategoria, :nombre, :descripcion)", nativeQuery=true)
	Integer registrar(@Param("idCategoria") Integer idCategoria, @Param("nombre") String nombre, @Param("descripcion") String descripcion);

}
