package br.com.hubfintech.app.validations;

import javax.persistence.PrePersist;

import br.com.hubfintech.app.entities.Account;

public class AccountPersistListener {

	@PrePersist
	public void accountBeforeSave(final Account account){
		System.out.println("teste");
	}
}
