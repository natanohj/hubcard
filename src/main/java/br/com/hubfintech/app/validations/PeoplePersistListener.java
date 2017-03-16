package br.com.hubfintech.app.validations;
import javax.persistence.PrePersist;
import br.com.hubfintech.app.entities.People;

public class PeoplePersistListener {

	@PrePersist
	public void peopleBeforeSave(final People people){
		System.out.println("teste");
	}
}
