package com.dto;

import com.dao.Owner_dao;

public class Driver_dto {
	String drivername;
	String driverssn;
	String driverdob;
	String licenceexpiration;
	String medicalexpiration;
	String drugtestexpiration;
	String trucknumber_assigned;
    String ownerssn;
    String ownername;
    
    
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public String getOwnerssn() {
		return ownerssn;
	}
	public void setOwnerssn(String ownerssn) {
		this.ownerssn = ownerssn;
	}
	public String getDrivername() {
		return drivername;
	}
	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}
	public String getDriverssn() {
		return driverssn;
	}
	public void setDriverssn(String driverssn) {
		this.driverssn = driverssn;
	}
	public String getDriverdob() {
		return driverdob;
	}
	public void setDriverdob(String driverdob) {
		this.driverdob = driverdob;
	}
	public String getLicenceexpiration() {
		return licenceexpiration;
	}
	public void setLicenceexpiration(String licenceexpiration) {
		this.licenceexpiration = licenceexpiration;
	}
	public String getMedicalexpiration() {
		return medicalexpiration;
	}
	public void setMedicalexpiration(String medicalexpiration) {
		this.medicalexpiration = medicalexpiration;
	}
	public String getDrugtestexpiration() {
		return drugtestexpiration;
	}
	public void setDrugtestexpiration(String drugtestexpiration) {
		this.drugtestexpiration = drugtestexpiration;
	}
	public String getTrucknumber_assigned() {
		return trucknumber_assigned;
	}
	public void setTrucknumber_assigned(String trucknumber_assigned) {
		this.trucknumber_assigned = trucknumber_assigned;
	}


}
