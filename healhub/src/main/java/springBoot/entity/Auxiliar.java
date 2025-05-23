package springBoot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Auxiliar {
	@Id
	@Column(name = "Aux_Numtrabajador")
	private String numTrabajador;
	@Column(name = "Aux_Nombre")
    private String nombre;
	@Column(name = "Aux_Apellidos")
    private String apellidos;
    
    public Auxiliar() {}
    
	public Auxiliar(String numTrabajador, String nombre, String apellidos) {
		super();
		this.numTrabajador = numTrabajador;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	public String getNumTrabajador() {
		return numTrabajador;
	}
	public void setNumTrabajador(String numTrabajador) {
		this.numTrabajador = numTrabajador;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
    
}
