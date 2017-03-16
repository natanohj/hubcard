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
public class Account {

    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String name;
    private Date created_at;
    
    public Account() {
    	this.created_at = new Date();
    }

    public Account(String name) {   	
    		this.name = name;    	
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreated_at() {
		return created_at;
	}

}