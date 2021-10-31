package com.example.hellospring.repository;

import com.example.hellospring.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member>store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        //Optional : null이어도 반환하게 해주기
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Member> findByName(String name) {
        //member.getName()이 name이랑 같은 경우 반환
        //루프를 돌면서 찾아지면 반환, 없으면 Optional에 null 포함해서 반환
        return store.values().stream()
                .filter(member -> member.getName().equals(name))
                .findAny();
    }

    @Override
    public List<Member> findAll() {
        //member들이 반환됨
        return new ArrayList<>(store.values());
    }

    public void clearStore(){
        //store 초기화
        store.clear();
    }
}
