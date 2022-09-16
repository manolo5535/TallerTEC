package com.TallerTEC.TallerTEC.Entidades;

public class Trabajador {
	
	public String nombre; 
	public String apellido1;
	public String apellido3;
	public Long cedula;
	public String fechaingreso;
	public String edad; 
	public String fechanacimiento;
	public String contraseña;
	public String rol;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	public Long getCedula() {
		return cedula;
	}
	public void setCedula(Long cedula) {
		this.cedula = cedula;
	}
	public String getFechaingreso() {
		return fechaingreso;
	}
	public void setFechaingreso(String fechaingreso) {
		this.fechaingreso = fechaingreso;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	
}
