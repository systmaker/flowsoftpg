package co.com.erp.flowsoftpg.entity;

import java.util.Date;

public class Auditoria {
	
	private String estado;
	private Date fecha_cre;
	private Usuario usuario_cre;
	private String proceso_cre;
	private Date fecha_mod;
	private Usuario usuario_mod;
	private String proceso_mod;
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public Date getFecha_cre() {
		return fecha_cre;
	}
	
	public void setFecha_cre(Date fecha_cre) {
		this.fecha_cre = fecha_cre;
	}
	
	public Usuario getUsuario_cre() {
		return usuario_cre;
	}
	
	public void setUsuario_cre(Usuario usuario_cre) {
		this.usuario_cre = usuario_cre;
	}
	
	public String getProceso_cre() {
		return proceso_cre;
	}
	
	public void setProceso_cre(String proceso_cre) {
		this.proceso_cre = proceso_cre;
	}
	
	public Date getFecha_mod() {
		return fecha_mod;
	}
	
	public void setFecha_mod(Date fecha_mod) {
		this.fecha_mod = fecha_mod;
	}
	
	public Usuario getUsuario_mod() {
		return usuario_mod;
	}
	
	public void setUsuario_mod(Usuario usuario_mod) {
		this.usuario_mod = usuario_mod;
	}
	
	public String getProceso_mod() {
		return proceso_mod;
	}
	
	public void setProceso_mod(String proceso_mod) {
		this.proceso_mod = proceso_mod;
	}	

}
