
package edu.unam.modelo;

import java.util.Date;

/**
 *
 * @author bbkmg
 */
public class SeguimientoEntrenamiento {
	// Atributos
	int idSeguimientoEntrenamiento;
	Date fechaHoy;
	int serie;
	int repeticion;
	String ejercicioTrabajado;
	double pesoTrabajado;
	
	// Constructor
	public SeguimientoEntrenamiento() {
	}
	
	// Set-Get
	public int getIdSeguimientoEntrenamiento(){
		return this.idSeguimientoEntrenamiento;
	}
	
	public Date getFechaHoy() {
		return this.fechaHoy;
	}
	
	public int getSerie() {
		return this.serie;
	}
	
	public int getRepeticion() {
		return this.repeticion;
	}
	
	public String getEjercicioTrabajado() {
		return this.ejercicioTrabajado;
	}
	
	public double getPesoTrabajado() {
		return this.pesoTrabajado;
	}
	
	public void setIdSeguimientoEntrenamiento(int numVal) {
		this.idSeguimientoEntrenamiento = numVal;
	}
	
	public void setFechaHoy( Date fechaVal) {
		this.fechaHoy = fechaVal;
	}
	
	public void setSerie(int numVal) {
		this.serie = numVal;
	}
	
	public void setRepeticion(int numVal) {
		this.repeticion = numVal;
	}
	
	public void setEjercicioTrabajado(String cadVal) {
		this.ejercicioTrabajado = cadVal;
	}
	
	public void setPesoTrabajado(double decimVal) {
		this.pesoTrabajado = decimVal;
	}
	
	// Metodos
	// ...
}
