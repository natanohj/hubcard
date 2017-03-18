package br.com.hubfintech.app.entities;

import javax.persistence.Entity;

@Entity
public class PeopleCompany extends People {
	
	 private String cnpj;
	 private String corporateName; // Razão Social 
	 private String businessName; // Nome Fantasia 
	
	 public String getCnpj() {
		return cnpj;
	}
	
	 public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	 public String getCorporateName() {
		return corporateName;
	}
	
	 public void setCorporateName(String corporateName) {
		this.corporateName = corporateName;
	}
	
	 public String getBusinessName() {
		return businessName;
	}
	
	 public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	 
}
