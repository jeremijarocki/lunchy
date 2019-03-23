package sda.soft.academy.lunchyproject.lunchy.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sda.soft.academy.lunchyproject.lunchy.dto.TransactionDto;
import sda.soft.academy.lunchyproject.lunchy.entities.Caterer;
import sda.soft.academy.lunchyproject.lunchy.entities.Transaction;
import sda.soft.academy.lunchyproject.lunchy.entities.TransactionItem;
import sda.soft.academy.lunchyproject.lunchy.repository.CatererRepository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class TransactionConverter  implements Function<TransactionDto, Transaction> {

    @Autowired
    private CatererRepository catererRepository;

    @Autowired
    private TransactionItemConverter transactionItemConverter;

    @Override
    public Transaction apply(TransactionDto transactionDto) {
        Transaction transaction = new Transaction();
        transaction.setId(transactionDto.getId());

        Optional<Caterer> caterer = catererRepository.findById(transactionDto.getCatererId());
        if (caterer.isPresent()) {
            transaction.setCaterer(caterer.get());
        }
        if (transactionDto.getOrderList() != null) {
            List<TransactionItem> transactionItems = transactionDto.getOrderList()
                    .stream()
                    .map(transactionItemDto -> transactionItemConverter.apply(transactionItemDto,transaction))
                    .collect(Collectors.toList());

            transaction.setOrderList(transactionItems);
        }
        return transaction;
    }
}
