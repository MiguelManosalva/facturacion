package com.facturacion.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.facturacion.model.Factura;

public class IFacturaRepo extends JpaRepository<Factura, Integer> {
	
	@Modifying 
	@Query(value = "INSERT INTO factura(num_factura, id_cliente, num_pago, fecha) VALUES (:numFactura, :idCliente, :numPago, :fecha)", nativeQuery=true)
	Integer registrar(@Param("numFactura") Integer numFactura, @Param("idCliente") Integer idCliente, @Param("numPago") String numPago,  @Param("fecha") Date fecha);

}
