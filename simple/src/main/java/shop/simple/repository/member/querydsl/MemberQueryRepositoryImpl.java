package shop.simple.repository.member.querydsl;

import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import shop.simple.dto.member.MemberDto;
import shop.simple.repository.member.querydsl.MemberQueryRepository;

import javax.persistence.EntityManager;
import java.util.List;

import static shop.simple.entity.QMember.*;

public class MemberQueryRepositoryImpl implements MemberQueryRepository {

    private final JPAQueryFactory queryFactory;
    public MemberQueryRepositoryImpl(EntityManager em) {
        this.queryFactory = new JPAQueryFactory(em);
    }

    @Override
    public List<MemberDto> findMemberDtoAll() {
        return queryFactory
                .select(Projections.fields(MemberDto.class,
                        member.id,
                        member.email
                        ))
                .from(member)
                .fetch();
    }


}
