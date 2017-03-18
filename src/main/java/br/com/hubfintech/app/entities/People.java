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
    private Long accountId;
    private Date created_at;
    
    public People() {
    	this.created_at = new Date();
    }

    public Date getCreated_at() {
		return created_at;
	}

	public Long getid_account() {
		return accountId;
	}

	public void setid_account(Long id_account) {
		this.accountId = id_account;
	}

}