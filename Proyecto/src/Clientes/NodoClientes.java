package Clientes;

import java.util.Date;

public class NodoClientes {
	String nombre, direccion, telefono;
	int nit,DPI;
	int contador=0;
	NodoClientes siguiente;
	NodoClientes(String nombre, String direccion, int nit,int DPI,String referencia,NodoClientes s){
		this.nombre=nombre;
		this.direccion=direccion;
		this.nit=nit;
		this.DPI=DPI;
		this.telefono=referencia;
		siguiente=s;
		contador+=1;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getNit() {
		return nit;
	}
	public void setNit(int nit) {
		this.nit = nit;
	}
	public int getDPI() {
		return DPI;
	}
	public void setDPI(int dPI) {
		DPI = dPI;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public int getContador() {
		return contador;
	}
	public void setContador(int contador) {
		this.contador = contador;
	}
	public NodoClientes getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(NodoClientes siguiente) {
		this.siguiente = siguiente;
	}
	
	

	}
