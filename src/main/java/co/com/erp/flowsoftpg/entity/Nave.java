package co.com.erp.flowsoftpg.entity;

public class Nave {
	
	private Integer id;
	private String descripcion;
	private Integer cama_ini;
	private Integer cama_fin;
	private String estado;
	private Invernadero invernadero;
	
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
