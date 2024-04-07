package com.kdh.consumemanage.member.service;

import com.kdh.consumemanage.member.dto.CreateMemberDto;
import com.kdh.consumemanage.member.model.Member;
import com.kdh.consumemanage.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public Member createMember(CreateMemberDto createMemberDto) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        Member member = new Member();
        member.setUsername(createMemberDto.getUsername());
        member.setNickname(createMemberDto.getNickname());
        member.setPassword(passwordEncoder.encode(createMemberDto.getPassword()));
        memberRepository.save(member);
        return member;
    }
}
