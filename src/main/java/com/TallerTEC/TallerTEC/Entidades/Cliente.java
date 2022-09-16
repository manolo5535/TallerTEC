package com.TallerTEC.TallerTEC.Entidades;

public class Cliente {
	
	public String nombre; 
	public String apellido1;
	public String apellido3;
	public int telefono; 
	public Long cedula;
	public String email;
	public String direccion; 
	public String usario;
	public String contraseña;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String aombre) {
		this.nombre = aombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido3() {
		return apellido3;
	}
	public void setApellido3(String apellido3) {
		this.apellido3 = apellido3;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public Long getCedula() {
		return cedula;
	}
	public void setCedula(Long cedula) {
		this.cedula = cedula;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getUsario() {
		return usario;
	}
	public void setUsario(String usario) {
		this.usario = usario;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	
}
