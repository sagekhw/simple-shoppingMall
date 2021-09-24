package shop.simple.restController.company;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shop.simple.service.company.CompanySaveService;

@RestController
@RequestMapping("/company/save")
@RequiredArgsConstructor
public class CompanySaveController {

    private final CompanySaveService companySaveService;

    /**
     * company 10개 생성
     */
    @GetMapping("/dataset")
    public void saveDataSet(){
        companySaveService.saveDataSet();
    }
}
