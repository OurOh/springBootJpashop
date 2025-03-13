package jpabook.jpashop;

import org.assertj.core.api.Assertions;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JpashopApplication.class)
public class Member17RepositoryTest {


    @Autowired
    MemberRepository memberRepository;

    @Test
    @Transactional
    @Rollback(false)
    public void testMember() {
        Member17 member17 = new Member17();
        member17.setUsername("memberA");

        Long savedId = memberRepository.save(member17);
        Member17 findMember17 = memberRepository.find(savedId);

        Assertions.assertThat(findMember17.getId()).isEqualTo(member17.getId());
        Assertions.assertThat(findMember17.getUsername()).isEqualTo(member17.getUsername());
        Assertions.assertThat(findMember17).isEqualTo(member17); //JPA 엔티티 동일성 보장
    }
}