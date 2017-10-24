package co.com.erp.flowsoftpg.entity;

import java.util.Date;

public class Siembra {
	
	private Integer id;
	private Double nroplantas;
	private Double metros_sem;
	private Date fecha;
	private String estado;
	private Cama cama;
	private Variedad variedad;
	
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
	
	public Date getFecha() {
		return fecha;
	}
	
	public void setFecha(Date fecha) {
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
