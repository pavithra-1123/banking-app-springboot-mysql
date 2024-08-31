package project.banking_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.banking_app.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
