package co.com.erp.flowsoftpg.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;

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
@Table (name = "cama")
public class Cama implements Serializable {
	
	private static final long serialVersionUID = 4775274869965966714L;
	
	@Id
	@GeneratedValue
	@Column (name = "id")
	private Integer id;
	
	@Column (name = "nrocama")	
	private Integer nrocama;
	
	@Column (name = "ancho")	
	private Double ancho;
	
	@Column (name = "largo")	
	private Double largo;
	
	@Column (name = "metros_tot")	
	private Double metros_tot;
	
	@Column (name = "metros_ocu")	
	private Double metros_ocu;
	
	@Column (name = "estado")	
	private String estado;
	
	@ManyToOne
	@JoinColumn (name = "idnave")
	private Nave nave;
	
	private Double metros_dis;
	
	public Cama (){
		super();
	}
	
	public Double getMetros_dis(){
		metros_dis = (getMetros_tot() - getMetros_ocu());
		
		BigDecimal bd = new BigDecimal(metros_dis);
		bd = bd.setScale(2, RoundingMode.HALF_UP);
		
		return bd.doubleValue();
	}
	
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
