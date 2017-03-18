package br.com.hubfintech.app.entities;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class PeoplePerson extends People  {

	 private String cpf;
	 private String fullName;
	 private Date birthDate;
	 
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

}