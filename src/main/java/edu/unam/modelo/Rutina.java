
package edu.unam.modelo;

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
public class Rutina {
	// Atributos
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idRutina; // PK
	
	@Basic
	private int serie;
	private int repeticion;
	
	private Ejercicio ejercicio; // Asociacion Ejercicio
	private RegistroEntrenamiento regEnt; // Asociacion RegistroEntrenamiento

	// Constructor
	public Rutina(){
	}
	
	// Set-Get
	public int getSerie(){
		return this.serie;
	}
	
	public int getRepeticion(){
		return this.repeticion;
	}
	
	// Metodos
	public void agregarEjercicio(Ejercicio e, int serie, int rep){
		this.ejercicio = e;
		this.serie = serie;
		this.repeticion = rep;
	}
}
