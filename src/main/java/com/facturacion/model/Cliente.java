package com.facturacion.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity
@Table(name="cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer idCliente;
	
	@OneToMany(mappedBy="cliente")
	private List<Factura> factura;
	
	@Size(min=3, message= "Nombre debe tener mínimo 3 caracteres")
	@Column(name="nombre", nullable=false, length=30)
	private String nombre;
	
	@Size(min=3, message="Apellido debe tener mínimo 3 caracteres")
	@Column(name="apellido", nullable=false, length=30)
	private String apellido;

	@Size(min = 3, max = 150, message = "Dirección debe tener mínimo 3 caracteres")
	@Column(name = "direccion", nullable = false, length = 150)
	private String direccion;
	
	@Column(name = "fecha_nacimiento", nullable = false)
	private Date fechaNacimiento;
	
	@Size(min=9, max=9, message="Teléfono debe tener 9 caracteres")
	@Column(name="telefono", nullable=false, length=9)
	private String telefono;
	
	@Email
	@Column(name="email", nullable=false, length=55)
	private String email;
	
	

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public List<Factura> getFactura() {
		return factura;
	}

	public void setFactura(List<Factura> factura) {
		this.factura = factura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
