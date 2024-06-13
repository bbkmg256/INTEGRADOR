
package edu.unam.modelo;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author bbkmg
 */

@Entity
public class Tutor {
    // Atributos
    @Id
	private int dni; // PK
	
	@Basic
    private String nombreTutor;
    private String apellidoTutor;
	private char sexo;
    private String ciudad;
	private String provincia;
	private int codPost;
	private Date fechaNac;
	
	private RegistroEntrenamiento regEnt; // Asociacion RegistroEntrenamiento

	
	// Constructor
	public Tutor(String nombre, String apellido, Date fechaNac, int dni, String ciudad, String provincia, int codPost, Date fechaIngreso){
		this.nombreTutor = nombre;
		this.apellidoTutor = apellido;
		this.fechaNac = fechaNac;
		this.dni = dni;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.codPost = codPost;
	}
	
	// Set-Get
	public String getNombre(){
		return this.nombreTutor;
	}
	
	public String getApellido(){
		return this.apellidoTutor;
	}
	
	public char getSexo(){
		return this.sexo;
	}
	
	// Metodos
	// ...
}
