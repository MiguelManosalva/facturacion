package com.facturacion.repo;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.facturacion.model.Cliente;

@RepositoryRestResource(path = "cliente")
public interface IClienteRepo extends JpaRepository<Cliente, Integer> {
	
	@Modifying 
	@Query(value = "INSERT INTO cliente(id_cliente, nombre, apellido, direccion, fecha_nacimiento, telefono, email) VALUES (:idCliente, :nombre, :apellido, :direccion, :fechaNacimiento, :telefono, :email)", nativeQuery=true)
	Integer registrar(@Param("idCliente") Integer idCliente, @Param("nombre") String nombre, @Param("apellido") String apellido, @Param("direccion") String direccion, @Param("fechaNacimiento") Date fechaNacimiento, @Param("telefono") String telefono, @Param("email") String email);

}
