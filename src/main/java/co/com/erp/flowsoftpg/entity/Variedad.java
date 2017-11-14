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
@Table (name = "variedad")
public class Variedad implements Serializable {

	private static final long serialVersionUID = 2261453749969676167L;
	
	@Id
	@GeneratedValue
	@Column (name = "id")	
	private Integer id;
	
	@Column (name = "descripcion")	
	private String descripcion;
	
	@Column (name = "plantasm2")
	private Integer plantasm2;
	
	@Column (name = "estado")
	private String estado;
	
	@ManyToOne
	@JoinColumn (name = "idproducto")
	private Producto producto;
	
	@ManyToOne
	@JoinColumn (name = "idcolor")	
	private Color color;
	
	public Variedad(){
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
	
	public Integer getPlantasm2() {
		return plantasm2;
	}

	public void setPlantasm2(Integer plantasm2) {
		this.plantasm2 = plantasm2;
	}	
	
	public Producto getProducto() {		
		if (producto == null){
			producto = new Producto();
		}		
		return producto;
	}
	
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	public Color getColor() {		
		if (color == null){
			color = new Color();
		}		
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
}
