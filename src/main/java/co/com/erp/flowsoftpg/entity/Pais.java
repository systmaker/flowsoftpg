package co.com.erp.flowsoftpg.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "pais")
public class Pais implements Serializable {

	private static final long serialVersionUID = 2688444912444700096L;
	
	@Id
	@GeneratedValue
	@Column (name = "id")
	private Integer id;
	
	@Column (name = "codigo")	
	private String codigo;
	
	@Column (name = "descripcion")	
	private String descripcion;
	
	@Column (name = "estado")	
	private String estado;	
	
	public Pais(){
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
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
		
}