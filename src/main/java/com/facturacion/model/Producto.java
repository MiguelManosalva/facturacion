package com.facturacion.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
@Table(name="producto")
public class Producto {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id_producto;
	
	@ManyToOne
	@JoinColumn(name="id_categoria", nullable=false, foreignKey = @ForeignKey(name = "FK_producto_categoria"))
	private Categoria categoria;
	
	@OneToMany(mappedBy="producto")
	private List<Detalle> detalle;
	
	@Size(min=3, message= "Nombre debe tener mínimo 3 caracteres")
	@Column(name="nombre", nullable=false, length=30)
	private String nombre;
	
	@Min(1)
	@Column(name="precio", nullable=false)
	private Long precio;
	
	@Min(1)
	@Column(name="stock", nullable=true)
	private Integer stock;

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getPrecio() {
		return precio;
	}

	public void setPrecio(Long precio) {
		this.precio = precio;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

}
