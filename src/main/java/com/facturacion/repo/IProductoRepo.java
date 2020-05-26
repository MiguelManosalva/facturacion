package com.facturacion.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.facturacion.model.Producto;

public interface IProductoRepo extends JpaRepository<Producto, Integer> {
	
	@Modifying 
	@Query(value = "INSERT INTO factura(id_producto, id_categoria, nombre, precio, stock) VALUES (:idProducto, :idCategoria, :nombre, :precio, :stock)", nativeQuery=true)
	Integer registrar(@Param("id_producto") Integer idProducto, @Param("idCategoria") Integer idCategoria, @Param("nombre") String nombre,  @Param("precio") Integer precio, @Param("stock") Integer stock);

}
