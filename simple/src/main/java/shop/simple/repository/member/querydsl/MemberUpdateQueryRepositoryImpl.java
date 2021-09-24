package shop.simple.repository.member.querydsl;

import com.querydsl.jpa.JPAExpressions;
import com.querydsl.jpa.impl.JPAQueryFactory;
import shop.simple.entity.QMember;

import static shop.simple.entity.QMember.*;
import static shop.simple.entity.QCompany.*;

import javax.persistence.EntityManager;

public class MemberUpdateQueryRepositoryImpl implements MemberUpdateQueryRepository {

    private final JPAQueryFactory queryFactory;
    public MemberUpdateQueryRepositoryImpl(EntityManager em) {
        this.queryFactory = new JPAQueryFactory(em);
    }

    @Override
    public void dataSetCompany() {
//        int temp = 1;
        for(int i=1,temp=1; i<=10; i++) {
            queryFactory.update(member)
                    .set(member.company.id, Long.valueOf(i))
                    .where(member.id.between(temp, i*10))
                    .execute();
            temp = i*10+1;
        }
    }
}
