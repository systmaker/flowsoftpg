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
@Table (name = "invernadero")
public class Invernadero implements Serializable {
	
	private static final long serialVersionUID = 4414247637398601943L;

	@Id
	@GeneratedValue
	@Column (name="id")
	private Integer id;
	
	@Column (name="descripcion")
	private String descripcion;
	
	@Column (name="estado")
	private String estado;
	
	@ManyToOne
	@JoinColumn (name = "idlocalizacion")
	private Localizacion localizacion;
	
	public Invernadero(){
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
	
	public Localizacion getLocalizacion() {
		return localizacion;
	}
	
	public void setLocalizacion(Localizacion localizacion) {
		this.localizacion = localizacion;
	}	

}
