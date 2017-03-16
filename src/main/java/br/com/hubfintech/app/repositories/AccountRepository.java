package br.com.hubfintech.app.repositories;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import br.com.hubfintech.app.entities.Account;

@Repository
public interface AccountRepository extends PagingAndSortingRepository<Account, Long> {
}
