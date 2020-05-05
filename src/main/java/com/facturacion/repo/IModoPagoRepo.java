package com.facturacion.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.facturacion.model.MetodoPago;

public class IModoPagoRepo extends JpaRepository<MetodoPago, Integer> {
	
	@Modifying 
	@Query(value = "INSERT INTO metodo_pago(num_pago, nombre, otros_detalles) VALUES (:numFactura, :nombre, :otros_detalles)", nativeQuery=true)
	Integer registrar(@Param("numPago") Integer numPago, @Param("nombre") String nombre, @Param("otrosDetalles") String otrosDetalles);

}
