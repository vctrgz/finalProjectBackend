package springBoot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Habitacion {
	@Id
	@Column(name = "Hab_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int habitacionId;
	@Column(name = "Hab_Obs")
	private String observaciones;
	@OneToOne(mappedBy = "habitacion")
    private Paciente paciente;
	
	public Habitacion() {}
	
	public Habitacion(int habitacionId, String observaciones) {
		super();
		this.habitacionId = habitacionId;
		this.observaciones = observaciones;
	}
	
	public int getHabitacionId() {
		return habitacionId;
	}
	public void setHabitacionId(int habitacionId) {
		this.habitacionId = habitacionId;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	public Paciente getPaciente() {
	    return paciente;
	}

	public void setPaciente(Paciente paciente) {
	    this.paciente = paciente;
	}
	
}
