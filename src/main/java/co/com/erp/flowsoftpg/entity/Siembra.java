package co.com.erp.flowsoftpg.entity;

import java.io.Serializable;
import java.util.Date;

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
@Table (name="siembra")
public class Siembra implements Serializable {
		
	private static final long serialVersionUID = -4064762573369271971L;
	
	@Id
	@GeneratedValue
	@Column (name = "id")
	private Integer id;
	
	@Column (name = "nroplantas")	
	private Double nroplantas;
	
	@Column (name = "metros_sem")	
	private Double metros_sem;
	
	@Column (name = "fecha")	
	/*private Date fecha;*/
	private String fecha;
	
	@Column (name = "estado")	
	private String estado;
	
	@ManyToOne
	@JoinColumn (name = "idcama")
	private Cama cama;
	
	@ManyToOne
	@JoinColumn (name = "idvariedad")
	private Variedad variedad;
	
	public Siembra(){
		super();
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Double getNroplantas() {
		return nroplantas;
	}
	
	public void setNroplantas(Double nroplantas) {
		this.nroplantas = nroplantas;
	}
	
	public Double getMetros_sem() {
		return metros_sem;
	}
	
	public void setMetros_sem(Double metros_sem) {
		this.metros_sem = metros_sem;
	}
	
	/*
	public Date getFecha() {
		return fecha;
	}
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	*/
	
	public String getFecha() {
		return fecha;
	}
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}	
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public Cama getCama() {
		return cama;
	}
	
	public void setCama(Cama cama) {
		this.cama = cama;
	}
	
	public Variedad getVariedad() {
		return variedad;
	}
	
	public void setVariedad(Variedad variedad) {
		this.variedad = variedad;
	}	
	
}
