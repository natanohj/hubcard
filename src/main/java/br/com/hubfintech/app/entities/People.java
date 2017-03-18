package br.com.hubfintech.app.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class People {

    @Id
    @GeneratedValue
    private Long id;
    private Date created_at;
    
    public People() {
    	this.created_at = new Date();
    }

    public Date getCreated_at() {
		return created_at;
	}

}