package com.facturacion.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;

@Entity
@Table(name="detalle")
public class Detalle {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer num_detalle;
	
	@Id
	private Factura factura;
	
	@Id
	private Producto producto;
	
	@Min(1)
	@Column(name="cantidad", nullable=false)
	private Integer cantidad;
	
	@Min(1)
	@Column(name="precio", nullable=false)
	private Long precio;

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Long getPrecio() {
		return precio;
	}

	public void setPrecio(Long precio) {
		this.precio = precio;
	}
	
	

}
