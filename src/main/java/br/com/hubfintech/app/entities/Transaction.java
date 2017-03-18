package br.com.hubfintech.app.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import br.com.hubfintech.app.validations.TransactionPersistListener;

@Entity
@EntityListeners(TransactionPersistListener.class)
public class Transaction {

    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    @OneToOne
    @JoinColumn(name="sourceAccountId")
    private Account sourceAccount;
    
    @OneToOne
    @JoinColumn(name="destinyAccountId")
    private Account destinyAccount;
    
    private Date createdAt;
    private Double amount;
    private String transactionCode; 
    
    
    public Transaction() {
    	this.createdAt = new Date();
    	this.transactionCode = java.util.UUID.randomUUID().toString();
    }


	public Account getSourceAccount() {
		return sourceAccount;
	}


	public void setSourceAccount(Account sourceAccount) {
		this.sourceAccount = sourceAccount;
	}


	public Account getDestinyAccount() {
		return destinyAccount;
	}


	public void setDestinyAccount(Account destinyAccount) {
		this.destinyAccount = destinyAccount;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}

}