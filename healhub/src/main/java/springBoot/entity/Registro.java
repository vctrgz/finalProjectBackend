package springBoot.entity;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Registro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "registro_id")
	private Integer registroId;
	@ManyToOne
	@JoinColumn(name = "pac_numHistorial") 
	private Paciente paciente;
    @OneToOne(mappedBy = "registro", cascade = CascadeType.ALL, orphanRemoval = true)
	private Diagnostico diagnostico;
    @OneToOne(mappedBy = "registro", cascade = CascadeType.ALL, orphanRemoval = true)
	private ConstantesVitales constantesVitales;
	
	private String numTrabajador;
	private LocalDateTime fechaRegistro;
	private Integer thigId;
	private String observaciones;
//	private Integer dietaId;
//	private Integer drenajeId;
//	private Integer movilidadId;
//	private Integer constantesVitalesId;
	
	public Registro() {}
	
	
	
	public Registro(Integer registroId, String numTrabajador, LocalDateTime fechaRegistro, Integer numHistorial,
			Integer thigId, String observaciones, Integer dietaId, Integer drenajeId, Integer movilidadId,
			Diagnostico diagnostico, Integer constantesVitalesId) {
		super();
		this.registroId = registroId;
		this.numTrabajador = numTrabajador;
		this.fechaRegistro = fechaRegistro;
		this.thigId = thigId;
		this.observaciones = observaciones;
		this.diagnostico = diagnostico;
//		this.dietaId = dietaId;
//		this.drenajeId = drenajeId;
//		this.movilidadId = movilidadId;
//		this.constantesVitalesId = constantesVitalesId;
	}

	public Integer getRegistroId() {
		return registroId;
	}

	public void setRegistroId(Integer registroId) {
		this.registroId = registroId;
	}

	public String getNumTrabajador() {
		return numTrabajador;
	}

	public void setNumTrabajador(String numTrabajador) {
		this.numTrabajador = numTrabajador;
	}

	public LocalDateTime getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(LocalDateTime fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Integer getThigId() {
		return thigId;
	}

	public void setThigId(Integer thigId) {
		this.thigId = thigId;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observacion) {
		this.observaciones = observacion;
	}

	
	
	
	

	public Diagnostico getDiagnostico() {
		return diagnostico;
	}



	public void setDiagnostico(Diagnostico diagnostico) {
		this.diagnostico = diagnostico;
	}



	public ConstantesVitales getConstantesVitales() {
		return constantesVitales;
	}



	public void setConstantesVitales(ConstantesVitales constantesVitales) {
		this.constantesVitales = constantesVitales;
	}



	@Override
	public String toString() {
		return "Registro [registroId=" + registroId + ", paciente=" + paciente + ", diagnostico=" + diagnostico
				+ ", constantesVitales=" + constantesVitales + ", numTrabajador=" + numTrabajador + ", fechaRegistro="
				+ fechaRegistro + ", thigId=" + thigId + ", observaciones=" + observaciones + "]";
	}

//	public Integer getDietaId() {
//		return dietaId;
//	}
//
//	public void setDietaId(Integer dietaId) {
//		this.dietaId = dietaId;
//	}
//
//	public Integer getDrenajeId() {
//		return drenajeId;
//	}
//
//	public void setDrenajeId(Integer drenajeId) {
//		this.drenajeId = drenajeId;
//	}
//
//	public Integer getMovilidadId() {
//		return movilidadId;
//	}
//
//	public void setMovilidadId(Integer movilidadId) {
//		this.movilidadId = movilidadId;
//	}
//
//
//	public Integer getConstantesVitalesId() {
//		return constantesVitalesId;
//	}
//
//	public void setConstantesVitalesId(Integer constantesVitalesId) {
//		this.constantesVitalesId = constantesVitalesId;
//	}
	
	
	
}
