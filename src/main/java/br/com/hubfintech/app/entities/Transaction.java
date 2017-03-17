package br.com.hubfintech.app.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import br.com.hubfintech.app.validations.TransactionPersistListener;

@Entity
@EntityListeners(TransactionPersistListener.class)
public class Transaction {

    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private Long id_account;
    private Date created_at;
    private Double money;
    private String code_transaction; // codigo alfanumerico 
    
    
    public Transaction() {
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

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public String getcode_transaction() {
		return code_transaction;
	}

	public void setcode_transaction(String code_transaction) {
		this.code_transaction = code_transaction;
	}



}