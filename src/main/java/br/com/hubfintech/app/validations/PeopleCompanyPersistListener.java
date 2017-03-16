package br.com.hubfintech.app.validations;
import javax.persistence.PrePersist;
import br.com.hubfintech.app.entities.PeopleCompany;


public class PeopleCompanyPersistListener {

	@PrePersist
	public void peopleCompanyBeforeSave(final PeopleCompany peopleCompany){
		System.out.println("teste");
	}
}
