package springBoot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class ConstantesVitales {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	@OneToOne
	private Registro registro;
    private String deposiciones;
    private float sistolicaTA;
    private float diastolicaTA;
    private float frecuenciaRespiratoria;
    private float temperatura;
    private float pulso;
    private float saturacionOxigeno;
    private float peso;
    private float talla;
    private float diuresis;
    private float STP;
    
    public ConstantesVitales() {}
    
	public ConstantesVitales(Integer id, String deposiciones, float sistolicaTA, float diastolicaTA,
			float frecuenciaRespiratoria, float temperatura, float pulso, float saturacionOxigeno, float peso,
			float talla, float diuresis, float sTP) {
		super();
		this.id = id;
		this.deposiciones = deposiciones;
		this.sistolicaTA = sistolicaTA;
		this.diastolicaTA = diastolicaTA;
		this.frecuenciaRespiratoria = frecuenciaRespiratoria;
		this.temperatura = temperatura;
		this.pulso = pulso;
		this.saturacionOxigeno = saturacionOxigeno;
		this.peso = peso;
		this.talla = talla;
		this.diuresis = diuresis;
		STP = sTP;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getDeposiciones() {
		return deposiciones;
	}

	public void setDeposiciones(String deposiciones) {
		this.deposiciones = deposiciones;
	}

	public float getSistolicaTA() {
		return sistolicaTA;
	}

	public void setSistolicaTA(float sistolicaTA) {
		this.sistolicaTA = sistolicaTA;
	}

	public float getDiastolicaTA() {
		return diastolicaTA;
	}

	public void setDiastolicaTA(float diastolicaTA) {
		this.diastolicaTA = diastolicaTA;
	}

	public float getFrecuenciaRespiratoria() {
		return frecuenciaRespiratoria;
	}

	public void setFrecuenciaRespiratoria(float frecuenciaRespiratoria) {
		this.frecuenciaRespiratoria = frecuenciaRespiratoria;
	}

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	public float getPulso() {
		return pulso;
	}

	public void setPulso(float pulso) {
		this.pulso = pulso;
	}

	public float getSaturacionOxigeno() {
		return saturacionOxigeno;
	}

	public void setSaturacionOxigeno(float saturacionOxigeno) {
		this.saturacionOxigeno = saturacionOxigeno;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getTalla() {
		return talla;
	}

	public void setTalla(float talla) {
		this.talla = talla;
	}

	public float getDiuresis() {
		return diuresis;
	}

	public void setDiuresis(float diuresis) {
		this.diuresis = diuresis;
	}

	public float getSTP() {
		return STP;
	}

	public void setSTP(float sTP) {
		STP = sTP;
	}

	@Override
	public String toString() {
		return "ConstantesVitales [id=" + id + ",  deposiciones=" + deposiciones
				+ ", sistolicaTA=" + sistolicaTA + ", diastolicaTA=" + diastolicaTA + ", frecuenciaRespiratoria="
				+ frecuenciaRespiratoria + ", temperatura=" + temperatura + ", pulso=" + pulso + ", saturacionOxigeno="
				+ saturacionOxigeno + ", peso=" + peso + ", talla=" + talla + ", diuresis=" + diuresis + ", STP=" + STP
				+ "]";
	}
	
    
}
