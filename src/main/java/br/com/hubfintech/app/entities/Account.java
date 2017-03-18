package br.com.hubfintech.app.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    private Date createdAt;
    @ManyToOne
    @JoinColumn(name="accountParentId")
    private Account accountParent;
	private enum status{ ATIVA,BLOQUEADA,CANCELADA };
	
	@ManyToOne
	@JoinColumn(name="peopleId",insertable=true,updatable=true)
	private People people;
    
    public Account() {
    	this.createdAt = new Date();
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
		return createdAt;
	}

	public Account getAccountParent() {
		return accountParent;
	}

	public void setAccountParent(Account accountParent) {
		this.accountParent = accountParent;
	}

	public People getPeople() {
		return people;
	}

	public void setPeople(People people) {
		this.people = people;
	}


}