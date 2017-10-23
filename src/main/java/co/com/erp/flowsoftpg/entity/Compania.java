package co.com.erp.flowsoftpg.entity;

public class Compania {
	
	private Integer id;
	private String codigo;
	private String descripcion;
	private String direccion;
	private Integer telefono1;
	private Integer telefono2;
	private Integer celular;
	private String email;
	private String estado;
	private Ciudad ciudad;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public Integer getTelefono1() {
		return telefono1;
	}
	
	public void setTelefono1(Integer telefono1) {
		this.telefono1 = telefono1;
	}
	
	public Integer getTelefono2() {
		return telefono2;
	}
	
	public void setTelefono2(Integer telefono2) {
		this.telefono2 = telefono2;
	}
	
	public Integer getCelular() {
		return celular;
	}
	
	public void setCelular(Integer celular) {
		this.celular = celular;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public Ciudad getCiudad() {
		return ciudad;
	}
	
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}	

}
