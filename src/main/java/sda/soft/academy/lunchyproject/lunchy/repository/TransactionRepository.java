package sda.soft.academy.lunchyproject.lunchy.repository;

        import org.springframework.data.repository.CrudRepository;
        import org.springframework.stereotype.Repository;
        import sda.soft.academy.lunchyproject.lunchy.entities.Transaction;

        import java.util.Optional;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long> {
    @Override
    Optional<Transaction> findById(Long aLong);

    @Override
    Iterable<Transaction> findAll();
}
