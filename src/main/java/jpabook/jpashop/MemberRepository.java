package jpabook.jpashop;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

    @PersistenceContext
    EntityManager em;

    public Long save(Member17 member17) {
        em.persist(member17);
        return member17.getId();
    }

    public Member17 find(Long id) {
        return em.find(Member17.class, id);
    }
}
