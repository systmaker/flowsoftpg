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
@Table (name = "compania")
public class Compania implements Serializable {
	
	private static final long serialVersionUID = -1241498389494969645L;
	
	@Id
	@GeneratedValue
	@Column (name = "id")
	private Integer id;
	
	@Column (name = "codigo")
	private String codigo;
	
	@Column (name = "descripcion")
	private String descripcion;
	
	@Column (name = "direccion")
	private String direccion;
	
	@Column (name = "telefono1")
	private String telefono1;
	
	@Column (name = "telefono2")
	private String telefono2;
	
	@Column (name = "celular")
	private String celular;
	
	@Column (name = "email")
	private String email;
	
	@Column (name = "estado")
	private String estado;
	
	@ManyToOne
	@JoinColumn (name = "idciudad")
	private Ciudad ciudad;
	
	public Compania(){
		super();
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
	
	public String getTelefono1() {
		return telefono1;
	}
	
	public void setTelefono1(String telefono1) {
		this.telefono1 = telefono1;
	}
	
	public String getTelefono2() {
		return telefono2;
	}
	
	public void setTelefono2(String telefono2) {
		this.telefono2 = telefono2;
	}
	
	public String getCelular() {
		return celular;
	}
	
	public void setCelular(String celular) {
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
	
	public Ciudad getCiudad() {
		return ciudad;
	}
	
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}	

}