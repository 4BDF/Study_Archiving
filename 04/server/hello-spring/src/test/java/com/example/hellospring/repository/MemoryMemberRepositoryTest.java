package com.example.hellospring.repository;

import com.example.hellospring.domain.Member;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    public void afterEach(){
        repository.clearStore();
    }

    @Test
    public void save(){
        Member member = new Member();
        member.setName("spring");

        repository.save(member);

        Member result = repository.findById(member.getId()).get();

        //new로 만든 member와와 데베에서 꺼 result가 똑같은지 확인
        System.out.println("result = " + (result == member));
        //같은지 확인하는 방법2, result를 null로 하면 테스트가 잘 실행되지 않음
        Assertions.assertEquals(result, member);
        //같은지 확인하는 방법3, alt+enter로 static improt함
        assertThat(member).isEqualTo(result);
    }
    
    @Test
    public void findByName(){
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        //spring1을 찾아서 result로 받아옴
        Member result = repository.findByName("spring1").get();

        //result와 member1이 같은지 확인
        //result를 "spring2"로 받아오면 다른 객체이기 때문에 오류
        assertThat(result).isEqualTo(member1);
    }

    @Test
    public void findAll(){
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        List<Member> result = repository.findAll();

        assertThat(result.size()).isEqualTo(2);
    }
}
