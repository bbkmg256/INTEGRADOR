
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
public class GrupoMuscular {
	// Atributos
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) // Especifica la forma de generación de las Id's en la BD
	private int idGrupoMuscular; // PK
	
	@Basic
	private String nombreGrupo;
	
	private ArrayList<Ejercicio> ejercicios; // Asociacion Ejercicion
	
	// Constructor
	public GrupoMuscular(String nombreGrupo){
		this.nombreGrupo = nombreGrupo;
	}
	
	// Set-Get
	// ...
	
	// Metodos
	// ...
}
