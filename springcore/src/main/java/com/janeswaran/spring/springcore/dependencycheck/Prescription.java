package com.janeswaran.spring.springcore.dependencycheck;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

public class Prescription {

	private int id;
	private String PatientName;
	private List<Integer> medicines;

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Prescription [id=" + id + ", PatientName=" + PatientName + ", medicines=" + medicines + "]";
	}

	
	//@required annotation can only be used in setter methods.
	@Required
	public void setId(int id) {
		this.id = id;
	}

	public String getPatientName() {
		return PatientName;
	}

	@Required
	public void setPatientName(String patientName) {
		PatientName = patientName;
	}

	public List<Integer> getMedicines() {
		return medicines;
	}

	public void setMedicines(List<Integer> medicines) {
		this.medicines = medicines;
	}

}
