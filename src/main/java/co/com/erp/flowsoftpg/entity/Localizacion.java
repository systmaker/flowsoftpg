package co.com.erp.flowsoftpg.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.repository.cdi.Eager;

@Entity
@Eager
@Table (name = "localizacion")
public class Localizacion implements Serializable {
	
	private static final long serialVersionUID = -2769705046055675400L;
	
	@Id
	@GeneratedValue
	@Column (name = "id")
	private Integer id;
	
	@Column (name = "descripcion")
	private String descripcion;
	
	@Column (name = "direccion")
	private String direccion;
	
	@Column (name = "telefono1")
	private Integer telefono1;
	
	@Column (name = "telefono2")
	private Integer telefono2;
	
	@Column (name = "celular")
	private Integer celular;
	
	@Column (name = "email")
	private String email;
	
	@Column (name = "estado")
	private String estado;
	
	@ManyToOne
	@JoinColumn (name = "idcompania")
	private Compania compania;
	
	@ManyToOne
	@JoinColumn (name = "idciudad")	
	private Ciudad ciudad;
	
	public Localizacion(){
		super();
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public Integer getTelefono1() {
		return telefono1;
	}
	
	public void setTelefono1(Integer telefono1) {
		this.telefono1 = telefono1;
	}
	
	public Integer getTelefono2() {
		return telefono2;
	}
	
	public void setTelefono2(Integer telefono2) {
		this.telefono2 = telefono2;
	}
	
	public Integer getCelular() {
		return celular;
	}
	
	public void setCelular(Integer celular) {
		this.celular = celular;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public Compania getCompania() {
		return compania;
	}
	
	public void setCompania(Compania compania) {
		this.compania = compania;
	}
	
	public Ciudad getCiudad() {
		return ciudad;
	}
	
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

}
