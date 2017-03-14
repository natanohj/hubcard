package br.com.hubfintech.app.repositories;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import br.com.hubfintech.app.entities.Customer;
@Repository
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
}
