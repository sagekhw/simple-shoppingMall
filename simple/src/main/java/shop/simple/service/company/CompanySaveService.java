package shop.simple.service.company;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shop.simple.entity.Company;
import shop.simple.repository.company.CompanyRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CompanySaveService {

    private final CompanyRepository companyRepository;


    public void saveDataSet() {
        List<Company> companies = new ArrayList<>();
        for(int i=0; i < 10; i++){
            companies.add(new Company("company_"+i));
        }
        companyRepository.saveAllAndFlush(companies);
    }
}
