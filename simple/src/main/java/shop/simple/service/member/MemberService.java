package shop.simple.service.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shop.simple.dto.member.MemberDto;
import shop.simple.entity.Member;
import shop.simple.repository.member.MemberRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberService {
    private final MemberRepository memberRepository;

    @Transactional
    public Long saveOne(MemberDto memberDto) {
        Member savedMember = memberRepository.save(new Member(memberDto.getEmail()));
        System.out.println("savedMember : "+savedMember);
        return savedMember.getId();
    }

    public List<MemberDto> findMemberDtoAll() {
        return memberRepository.findMemberDtoAll();
    }

    @Transactional
    public Long saveDataSet() {
        List<Member> members = new ArrayList<>();
        for(int i=0; i < 100; i++) {
            members.add(new Member("user"+i+"@email.com"));
        }
        memberRepository.saveAll(members);
        return 100L;
    }

    @Transactional
    public void dataSetCompany() {
        memberRepository.dataSetCompany();
    }
}
