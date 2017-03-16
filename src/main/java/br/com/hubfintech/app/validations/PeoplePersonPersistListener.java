package br.com.hubfintech.app.validations;
import javax.persistence.PrePersist;
import br.com.hubfintech.app.entities.PeoplePerson;


public class PeoplePersonPersistListener {

	@PrePersist
	public void peoplePersonBeforeSave(final PeoplePerson peoplePerson){
		System.out.println("teste");
	}
}
