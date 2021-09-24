package shop.simple.restController.member;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import shop.simple.dto.member.MemberDto;
import shop.simple.service.member.MemberService;

import java.util.List;

@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    /**
     * member 100개 생성
     */
    @GetMapping("/save/dataset")
    public Long saveDataSet(){
        return memberService.saveDataSet();
    }

    @PostMapping("/save/one")
    public Long saveOne(@RequestBody MemberDto memberDto){
        return memberService.saveOne(memberDto);
    }

    /**
     * company + member 연결
     */
    @GetMapping("/update/dataset/company")
    public Long dataSetCompany(){
        memberService.dataSetCompany();
        return 100L;
    }


    @GetMapping("/find/All")
    public List<MemberDto> findMemberDtoAll(){
        return memberService.findMemberDtoAll();
    }


}
