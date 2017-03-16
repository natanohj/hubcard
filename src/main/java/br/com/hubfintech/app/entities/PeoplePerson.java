package br.com.hubfintech.app.entities;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import br.com.hubfintech.app.validations.AccountPersistListener;

@Entity
@EntityListeners(AccountPersistListener.class)
public class PeoplePerson extends People  {

	 @NotNull
	 private String cpf;
	 @NotNull
	 private String fullName;
	 @NotNull
	 private Date dtBirth;
	 
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
	public Date getDtBirth() {
		return dtBirth;
	}
	public void setDtBirth(Date dtBirth) {
		this.dtBirth = dtBirth;
	}

}