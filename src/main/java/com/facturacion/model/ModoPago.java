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


@Entity
@Table(name="modo_pago")
public class ModoPago {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer numPago;
	
	@Column(name="nombre", length=3, nullable=true)
	private String nombre;
	
	@Column(name="otros_detalles", length=3, nullable=true)
	private String otrosDetalles;
	
	@OneToMany(mappedBy="modo_pago", cascade = {CascadeType.ALL}, orphanRemoval = true)
	private List<Factura> factura;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOtrosDetalles() {
		return otrosDetalles;
	}

	public void setOtrosDetalles(String otrosDetalles) {
		this.otrosDetalles = otrosDetalles;
	}

	
}
