package ReservacionHabitaciones;

import java.util.Date;

public class Nodo {

	private String Nombre, TipoHabitacion, Referencia;
	private Date FechaInicio, FechaFin;
	private int NIT, NoReservacion, Torre, Modulo, Habitacion;
	private float monto;
	
	Nodo siguiente;
	
	public Nodo (int noReservacion, Date fechaInicio, Date fechaFin,String tipoHabitacion, int torre, int modulo, int habitacion, String nombre, 
			int nit,String referencia,Nodo s){
		NoReservacion=noReservacion;
		Nombre=nombre;
		TipoHabitacion=tipoHabitacion;
		Referencia=referencia;
		FechaInicio=fechaInicio;
		FechaFin=fechaFin;
		NIT= nit;
		Torre=torre;
		Modulo=modulo;
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

	public Date getFecha() {
		return FechaInicio;
	}

	public void setFecha(Date fecha) {
		FechaInicio = fecha;
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

	public int getTorre() {
		return Torre;
	}

	public void setTorre(int torre) {
		Torre = torre;
	}

	public int getModulo() {
		return Modulo;
	}

	public void setModulo(int modulo) {
		Modulo = modulo;
	}

	public int getHabitacion() {
		return Habitacion;
	}

	public void setHabitacion(int habitacion) {
		Habitacion = habitacion;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	
}
