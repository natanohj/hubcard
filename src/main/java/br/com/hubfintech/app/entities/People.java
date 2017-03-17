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
public class People {

    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private Long id_account;
    private Date created_at;
    
    public People() {
    	this.created_at = new Date();
    }

    public Date getCreated_at() {
		return created_at;
	}

	public Long getid_account() {
		return id_account;
	}

	public void setid_account(Long id_account) {
		this.id_account = id_account;
	}

}