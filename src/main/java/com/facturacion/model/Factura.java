package com.facturacion.model;

import java.util.Date;
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


@Entity
@Table(name="factura")
public class Factura {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer numFactura;
	
	@ManyToOne
	@JoinColumn(name="id_cliente", nullable=false, foreignKey = @ForeignKey(name = "FK_factura_cliente"))
	private Cliente cliente;

	@ManyToOne
	@JoinColumn(name="num_pago", nullable=false, foreignKey = @ForeignKey(name = "FK_factura_modo_pago"))
	private ModoPago modoPago;

	@OneToMany(mappedBy="factura")
	private List<Detalle> detalle;
	
	@Column(name = "fecha", nullable = false)
	private Date fecha;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ModoPago getModoPago() {
		return modoPago;
	}

	public void setModoPago(ModoPago modoPago) {
		this.modoPago = modoPago;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	
	
}
