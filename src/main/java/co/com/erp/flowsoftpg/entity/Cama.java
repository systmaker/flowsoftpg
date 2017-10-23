package co.com.erp.flowsoftpg.entity;

public class Cama {
	
	private Integer id;
	private Integer nrocama;
	private Double ancho;
	private Double largo;
	private Double metros_tot;
	private Double metros_ocu;
	private String estado;
	private Nave nave;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getNrocama() {
		return nrocama;
	}
	
	public void setNrocama(Integer nrocama) {
		this.nrocama = nrocama;
	}
	
	public Double getAncho() {
		return ancho;
	}
	
	public void setAncho(Double ancho) {
		this.ancho = ancho;
	}
	
	public Double getLargo() {
		return largo;
	}
	
	public void setLargo(Double largo) {
		this.largo = largo;
	}
	
	public Double getMetros_tot() {
		return metros_tot;
	}
	
	public void setMetros_tot(Double metros_tot) {
		this.metros_tot = metros_tot;
	}
	
	public Double getMetros_ocu() {
		return metros_ocu;
	}
	
	public void setMetros_ocu(Double metros_ocu) {
		this.metros_ocu = metros_ocu;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public Nave getNave() {
		return nave;
	}
	
	public void setNave(Nave nave) {
		this.nave = nave;
	}	

}
