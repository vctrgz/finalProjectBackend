package springBoot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Diagnostico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int diaId;
	@OneToOne
	private Registro registro;
	private String diaDiagnostico;
	private String diaMotivo;
	private int dia02;
	private String diaO2Desc;
	private int diaPanales;
	private String diaDesc;
	private int diaSV;
	private String diaSVTipo;
	private String diaSVDebito;
	private int diaSR;
	private String diaSRDebito;
	private String diaSRG;
	private String diaSRGDesc;
	
	
	public Diagnostico() {}
	
	public Diagnostico(int diaId, String diaDiagnostico, String diaMotivo) {
		super();
		this.diaId = diaId;
		this.diaDiagnostico = diaDiagnostico;
		this.diaMotivo = diaMotivo;
	}
	
	

	public int getDia02() {
		return dia02;
	}

	public void setDia02(int dia02) {
		this.dia02 = dia02;
	}

	public String getDiaO2Desc() {
		return diaO2Desc;
	}

	public void setDiaO2Desc(String diaO2Desc) {
		this.diaO2Desc = diaO2Desc;
	}

	public int getDiaPanales() {
		return diaPanales;
	}

	public void setDiaPanales(int diaPanales) {
		this.diaPanales = diaPanales;
	}

	public String getDiaDesc() {
		return diaDesc;
	}

	public void setDiaDesc(String diaDesc) {
		this.diaDesc = diaDesc;
	}

	public int getDiaSV() {
		return diaSV;
	}

	public void setDiaSV(int diaSV) {
		this.diaSV = diaSV;
	}

	public String getDiaSVTipo() {
		return diaSVTipo;
	}

	public void setDiaSVTipo(String diaSVTipo) {
		this.diaSVTipo = diaSVTipo;
	}

	public String getDiaSVDebito() {
		return diaSVDebito;
	}

	public void setDiaSVDebito(String diaSVDebito) {
		this.diaSVDebito = diaSVDebito;
	}

	public int getDiaSR() {
		return diaSR;
	}

	public void setDiaSR(int diaSR) {
		this.diaSR = diaSR;
	}

	public String getDiaSRDebito() {
		return diaSRDebito;
	}

	public void setDiaSRDebito(String diaSRDebito) {
		this.diaSRDebito = diaSRDebito;
	}

	public String getDiaSRG() {
		return diaSRG;
	}

	public void setDiaSRG(String diaSRG) {
		this.diaSRG = diaSRG;
	}

	public String getDiaSRGDesc() {
		return diaSRGDesc;
	}

	public void setDiaSRGDesc(String diaSRGDesc) {
		this.diaSRGDesc = diaSRGDesc;
	}

	public int getDiaId() {
		return diaId;
	}
	public void setDiaId(int diaId) {
		this.diaId = diaId;
	}
	public String getDiaDiagnostico() {
		return diaDiagnostico;
	}
	public void setDiaDiagnostico(String diaDiagnostico) {
		this.diaDiagnostico = diaDiagnostico;
	}
	public String getDiaMotivo() {
		return diaMotivo;
	}
	public void setDiaMotivo(String diaMotivo) {
		this.diaMotivo = diaMotivo;
	}
	
}
