package com.facturacion.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id_categoria;
	
	@Size(min=3, message= "Nombre debe tener mínimo 3 caracteres")
	@Column(name="nombre", nullable=false, length=30)
	private String nombre;
	
	@Size(min=10, message= "Descripción debe tener mínimo 10 caracteres")
	@Column(name="descripcion", nullable=false, length=30)
	private String descripcion;
	
	@OneToMany(mappedBy="categoria", cascade = {CascadeType.ALL}, orphanRemoval = true)
	private List<Producto> producto;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
