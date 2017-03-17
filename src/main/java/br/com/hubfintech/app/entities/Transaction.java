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
    private Long idAccount;
    private Date created_at;
    private Double money;
    private String codeTransaction; // codigo alfanumerico 
    
    
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

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public String getCodeTransaction() {
		return codeTransaction;
	}

	public void setCodeTransaction(String codeTransaction) {
		this.codeTransaction = codeTransaction;
	}



}