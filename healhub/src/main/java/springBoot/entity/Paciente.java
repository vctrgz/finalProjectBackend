package springBoot.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Paciente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer numHistorial;
	@OneToOne
	@JoinColumn(name = "Hab_id", unique = true) // FK en Paciente, referencia a Habitacion
	private Habitacion habitacion;
	@OneToMany
	private List<Registro> registros = new ArrayList<>();

	private String nombre;
	private String apellidos;
	private Date fechaNacimiento;
	private String direccionCompleta;
	private String lenguaMaterna;
	private String antecedentes;
	private String alergias;
	private String nombreCuidador;
	private String telefonoCuidador;
	private LocalDateTime fechaIngreso;
	private LocalDateTime timestamp;
	
	public Paciente() {}
	
	public Paciente(Integer numHistorial, String nombre, String apellidos, Date fechaNacimiento,
			String direccionCompleta, String lenguaMaterna, String antecedentes, String alergias, String nombreCuidador,
			String telefonoCuidador, LocalDateTime fechaIngreso, LocalDateTime timestamp) {
		super();
		this.numHistorial = numHistorial;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.direccionCompleta = direccionCompleta;
		this.lenguaMaterna = lenguaMaterna;
		this.antecedentes = antecedentes;
		this.alergias = alergias;
		this.nombreCuidador = nombreCuidador;
		this.telefonoCuidador = telefonoCuidador;
		this.fechaIngreso = fechaIngreso;
		this.timestamp = timestamp;
	}
	
	public Integer getNumHistorial() {
		return numHistorial;
	}
	public void setNumHistorial(Integer numHistorial) {
		this.numHistorial = numHistorial;
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
	
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getDireccionCompleta() {
		return direccionCompleta;
	}
	public void setDireccionCompleta(String direccionCompleta) {
		this.direccionCompleta = direccionCompleta;
	}
	
	public String getLenguaMaterna() {
		return lenguaMaterna;
	}
	public void setLenguaMaterna(String lenguaMaterna) {
		this.lenguaMaterna = lenguaMaterna;
	}
	
	public String getAntecedentes() {
		return antecedentes;
	}
	public void setAntecedentes(String antecedentes) {
		this.antecedentes = antecedentes;
	}
	
	public String getAlergias() {
		return alergias;
	}
	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}
	
	public String getNombreCuidador() {
		return nombreCuidador;
	}
	public void setNombreCuidador(String nombreCuidador) {
		this.nombreCuidador = nombreCuidador;
	}
	
	public String getTelefonoCuidador() {
		return telefonoCuidador;
	}
	public void setTelefonoCuidador(String telefonoCuidador) {
		this.telefonoCuidador = telefonoCuidador;
	}
	
	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	
	
	
}
