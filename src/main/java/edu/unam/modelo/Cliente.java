
package edu.unam.modelo;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author bbkmg
 */

@Entity
public class Cliente {
    // Atributos
	@Id
    private int dni; // PK
    
	@Basic
	private String nombreCliente;
    private String apellidoCliente;
	private char sexo;
    private String ciudad;
	private String provincia;
	private int codPost;
	
	@Temporal(TemporalType.DATE)
	private Date fechaNac;
	private Date fechaIngreso;
	
	private RegistroEntrenamiento regEnt; // Asociacion RegistroEntrenamiento

	
	// Constructor
	public Cliente(String nombre, String apellido, Date fechaNac, int dni, char sexo, String ciudad, String provincia, int codPost, Date fechaIngreso){
		this.nombreCliente = nombre;
		this.apellidoCliente = apellido;
		this.fechaNac = fechaNac;
		this.dni = dni;
		this.sexo = sexo;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.codPost = codPost;
		this.fechaIngreso = fechaIngreso;
	}
	
	// Set-Get
	public String getNombreCliente(){
		return this.nombreCliente;
	}
	
	public String getApellidoCliente(){
		return this.apellidoCliente;
	}
	
	public Date getFechaNacimiento(){
		return this.fechaNac;
	}
	
	public int getDni(){
		return this.dni;
	}
	
	public String getCiudad(){
		return this.ciudad;
	}
	
	public String getProvincia(){
		return this.provincia;
	}
	
	public int getCodigoPostal(){
		return this.codPost;
	}
	
	public Date getFechaiIngreso(){
		return this.fechaIngreso;
	}
	
	// Metodos
	public void calificarTutor(RegistroEntrenamiento reg, int puntaje){
		reg.setCalificacionTutor(puntaje);
	}
}
