package com.example.hellospring.service;

import com.example.hellospring.domain.Member;
import com.example.hellospring.repository.MemberRepository;
import com.example.hellospring.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    //회원가입
    public Long join(Member member){
        //중복회원 검증
        validateDuplicateMember(member);

        memberRepository.save(member);
        //임의로 아이디 반환
        return member.getId();
    }

    private void validateDuplicateMember(Member member){
        /**
         //같은 이름이 있는 중복 회원 안 되게 하기
         Optional<Member> result = memberRepository.findByName(member.getName());
         //ifPresent : 값이 있으면 동작, optional이 아니면 if null
         result.ifPresent(m -> {
         throw new IllegalStateException("이미 존재하는 회원입니다.");
         });
         */

        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    //전체 회원 조회
    public List<Member> findMembers(){
        return memberRepository.findAll();
    }

    //회원 찾기
    public Optional<Member> findOne(Long memberId){
        return memberRepository.findById(memberId);
    }
}
