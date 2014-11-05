package ReservacionHabitaciones;

import java.util.Date;
import Clientes.Clientes;
import ReservacionHabitaciones.Lista;

public class Nodo {

	private String Nombre, TipoHabitacion, Referencia, edificio;
	private Date FechaInicio, FechaFin;
	private int NIT, NoReservacion, NoEdificio, Habitacion,dias;
	public Lista cola= new Lista();
	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	private float monto;
	
	Nodo siguiente;
	
	public Nodo (int noReservacion, Date fechaInicio, Date fechaFin,int dias,String tipoHabitacion, String edifiio, int NoEdificio, int habitacion, String nombre, 
			int nit,String referencia,Nodo s){
		
		NoReservacion=noReservacion;
		Nombre=nombre;
		TipoHabitacion=tipoHabitacion;
		Referencia=referencia;
		FechaInicio=fechaInicio;
		FechaFin=fechaFin;
		this.dias=dias;
		NIT= nit;
		this.edificio=edificio;
		this.NoEdificio=NoEdificio;
		Habitacion=habitacion;
		if (TipoHabitacion=="Sencilla")
			monto=200;
		else if (TipoHabitacion=="Regular")
			monto=350;
		else if (TipoHabitacion=="Exclusiva")
			monto=500;
		
		siguiente=s;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getTipoHabitacion() {
		return TipoHabitacion;
	}

	public void setTipoHabitacion(String tipoHabitacion) {
		TipoHabitacion = tipoHabitacion;
	}

	public String getReferencia() {
		return Referencia;
	}

	public void setReferencia(String referencia) {
		Referencia = referencia;
	}

	public String getEdificio() {
		return edificio;
	}

	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}

	public Date getFechaInicio() {
		return FechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		FechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return FechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		FechaFin = fechaFin;
	}

	public int getNIT() {
		return NIT;
	}

	public void setNIT(int nIT) {
		NIT = nIT;
	}

	public int getNoReservacion() {
		return NoReservacion;
	}

	public void setNoReservacion(int noReservacion) {
		NoReservacion = noReservacion;
	}

	public int getNoEdificio() {
		return NoEdificio;
	}

	public void setNoEdificio(int noEdificio) {
		NoEdificio = noEdificio;
	}

	public int getHabitacion() {
		return Habitacion;
	}

	public void setHabitacion(int habitacion) {
		Habitacion = habitacion;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	
	
}
