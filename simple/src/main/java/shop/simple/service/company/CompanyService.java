package shop.simple.service.company;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shop.simple.repository.company.CompanyRepository;

@Service
@Transactional
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;

}
