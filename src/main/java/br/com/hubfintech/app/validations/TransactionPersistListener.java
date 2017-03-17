package br.com.hubfintech.app.validations;

import javax.persistence.PrePersist;

import br.com.hubfintech.app.entities.Transaction;

public class TransactionPersistListener {

	@PrePersist
	public void accountBeforeSave(final Transaction transaction){
		System.out.println("teste");
	}
}
