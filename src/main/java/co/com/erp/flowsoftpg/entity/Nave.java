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
@Table (name = "nave")
public class Nave implements Serializable {
	
	private static final long serialVersionUID = -3615486528347086556L;
	
	@Id
	@GeneratedValue
	@Column (name = "id")	
	private Integer id;
	
	@Column (name = "descripcion")	
	private String descripcion;
	
	@Column (name = "cama_ini")	
	private Integer cama_ini;
	
	@Column (name = "cama_fin")	
	private Integer cama_fin;
	
	@Column (name = "estado")	
	private String estado;
	
	@ManyToOne
	@JoinColumn (name="idinvernadero")
	private Invernadero invernadero;
	
	public Nave(){
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
	
	public Integer getCama_ini() {
		return cama_ini;
	}
	
	public void setCama_ini(Integer cama_ini) {
		this.cama_ini = cama_ini;
	}
	
	public Integer getCama_fin() {
		return cama_fin;
	}
	
	public void setCama_fin(Integer cama_fin) {
		this.cama_fin = cama_fin;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public Invernadero getInvernadero() {
		return invernadero;
	}
	
	public void setInvernadero(Invernadero invernadero) {
		this.invernadero = invernadero;
	}

}
