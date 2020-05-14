package com.facturacion.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.facturacion.model.Detalle;

public interface IDetalleRepo extends JpaRepository<Detalle, Integer> {
	
	@Modifying 
	@Query(value = "INSERT INTO detalle(num_detalle, id_factura, id_producto, cantidad, precio) VALUES (:numDetalle, :idFactura, idProducto, :cantidad, :precio)", nativeQuery=true)
	Integer registrar(@Param("numDetalle") Integer numDetalle, @Param("idFactura") Integer idFactura, @Param("idProducto") Integer idProducto, @Param("cantidad") Integer cantidad, @Param("precio") Integer precio);

}
