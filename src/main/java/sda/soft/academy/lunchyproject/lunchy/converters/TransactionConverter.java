package sda.soft.academy.lunchyproject.lunchy.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import sda.soft.academy.lunchyproject.lunchy.dto.TransactionDto;
import sda.soft.academy.lunchyproject.lunchy.entities.*;
import sda.soft.academy.lunchyproject.lunchy.repository.CatererRepository;
import sda.soft.academy.lunchyproject.lunchy.repository.CompanyRepository;
import sda.soft.academy.lunchyproject.lunchy.repository.UserRepository;

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
    private UserRepository userRepository;

    @Autowired
    private TransactionItemConverter transactionItemConverter;

    @Autowired
    private CompanyRepository companyRepository;

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

            transaction.setOrdersList(transactionItems);
        }
        transaction.setAdditionalComments(transactionDto.getAdditionalComments());

        Optional<Company> company = companyRepository.findById(transactionDto.getCompanyId());
        if(company.isPresent()) {
            transaction.setCompany(company.get());
        }

        Optional<User> user = userRepository.findById(transactionDto.getUserId());
        if(user.isPresent()) {
            transaction.setUser(user.get());
        }

        return transaction;
    }
}
