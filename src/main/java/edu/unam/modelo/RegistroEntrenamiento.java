
package edu.unam.modelo;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author bbkmg
 */

@Entity
public class RegistroEntrenamiento {
	// Atributos
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idReg; // PK
	
	@Basic
	// Asociacion de cliente, tutor y rutina
	private Cliente cli;
	private Tutor tutor;
	private Rutina rutina;

	// Calificacion a tutor y volumen de entrenamiento por parte del cliente
	private int calificacionTutor;
	private int volumenEntrenamiento;
	
	// Se establecen las fechas de inicio y fin (Siguiendo la condicion de 4 semanas)
	private Date fechaInicio;
	private Date fechaFinalizacion;
	
	// Constructor
	public RegistroEntrenamiento(Cliente cliente, Tutor tutor, Rutina rutina, Date fechaInicio, Date fechaFinalizacion){
		this.cli = cliente;
		this.tutor = tutor;
		this.rutina = rutina;
		
		this.calificacionTutor = 0;
		this.volumenEntrenamiento = 0;
		
		this.fechaInicio = fechaInicio;
		this.fechaFinalizacion = fechaFinalizacion;
	}
	
	// Set-Get
	public void setCalificacionTutor(int puntaje){
		this.calificacionTutor = puntaje;
	}
	
	public void setVolumenEntrenamiento(int vol){
		this.volumenEntrenamiento = vol;
	}
	
	/*
	public int setVolumenEntrenamientoSemanal(int serie, int repeticion, int peso){
		this.volumenEntrenamiento
	}*/
	
	// Metodos
	// ...
}