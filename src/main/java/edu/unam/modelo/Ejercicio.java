
package edu.unam.modelo;

import java.util.ArrayList;
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
public class Ejercicio {
	// Atributos
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idEjercicio;
	
	@Basic
	private String nombreEjercicio;
	
	// private GrupoMuscular grupoMuscular; // Asociacion GrupoMuscular
	private ArrayList<GrupoMuscular> grupoMuscular; // Asociacion GrupoMuscular
	private ArrayList<Rutina> rutinas; // Asociacion Rutina
	
	// Constructor
	public Ejercicio(String nombreEjercicio){
		this.nombreEjercicio = nombreEjercicio;
	}
	
	// Set-Get
	public String getNombreEjercicio(){
		return this.nombreEjercicio;
	}
	
	// Metodos
	public void agregarGrupoMuscular(GrupoMuscular gm){
		this.grupoMuscular.add(gm);
	}
}
