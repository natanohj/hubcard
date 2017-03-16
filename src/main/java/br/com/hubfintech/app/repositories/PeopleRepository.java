package br.com.hubfintech.app.repositories;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import br.com.hubfintech.app.entities.People;


@Repository
public interface PeopleRepository extends PagingAndSortingRepository<People, Long> {
	
}
