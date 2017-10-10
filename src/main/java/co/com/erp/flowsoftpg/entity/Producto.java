package co.com.erp.flowsoftpg.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Producto")
public class Producto implements Serializable {
	
	private static final long serialVersionUID = 1865383594752290647L;
	
	@Id
	@GeneratedValue
	@Column (name = "Id")
	private Integer id;
	
	@Column (name = "Descripcion")
	private String descripcion;
	
	@Column (name = "Estado")
	private String estado;
	
	public Producto(){
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
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
