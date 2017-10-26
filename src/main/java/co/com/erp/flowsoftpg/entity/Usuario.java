package co.com.erp.flowsoftpg.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.repository.cdi.Eager;

@Entity
@Eager
@Table (name = "usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 2074068063426909959L;
	
	@Id
	@GeneratedValue
	@Column (name = "id")
	private Integer id;
	
	@Column (name = "codigo")
	private String codigo;
	
	@Column (name = "nombre")
	private String nombre;
	
	@Column (name = "apellido")
	private String apellido;
	
	@Column (name = "cargo")
	private String cargo;
	
	@Column (name = "clave")
	private String clave;
	
	@Column (name = "fecha_cad")
	private Date fecha_cad;
	
	@Column (name = "email")
	private String email;
	
	@Column (name = "estado")
	private String estado;
	
	public Usuario(){
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
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String getClave() {
		return clave;
	}
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public Date getFecha_cad() {
		return fecha_cad;
	}
	
	public void setFecha_cad(Date fecha_cad) {
		this.fecha_cad = fecha_cad;
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

}
