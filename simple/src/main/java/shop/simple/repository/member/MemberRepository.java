package shop.simple.repository.member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.simple.entity.Member;
import shop.simple.repository.member.querydsl.MemberQueryRepository;
import shop.simple.repository.member.querydsl.MemberSaveQueryRepository;
import shop.simple.repository.member.querydsl.MemberUpdateQueryRepository;

@Repository
public interface MemberRepository extends
        JpaRepository<Member,Long>,
        MemberQueryRepository,
        MemberSaveQueryRepository,
        MemberUpdateQueryRepository
{ }
