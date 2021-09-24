package shop.simple.repository.company;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.simple.entity.Company;

@Repository
public interface CompanyRepository extends
        JpaRepository<Company,Long>,
        CompanyQueryRepository,
        CompanySaveQueryRepository
{ }
