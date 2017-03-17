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
public class Transaction {

    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private Long idAccount;
    private Date created_at;
    
    public Transaction() {
    	this.created_at = new Date();
    }

    public Date getCreated_at() {
		return created_at;
	}

	public Long getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(Long idAccount) {
		this.idAccount = idAccount;
	}

}