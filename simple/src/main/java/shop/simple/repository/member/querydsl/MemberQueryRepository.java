package shop.simple.repository.member.querydsl;

import org.springframework.stereotype.Repository;
import shop.simple.dto.member.MemberDto;

import java.util.List;


public interface MemberQueryRepository {
    List<MemberDto> findMemberDtoAll();

}
