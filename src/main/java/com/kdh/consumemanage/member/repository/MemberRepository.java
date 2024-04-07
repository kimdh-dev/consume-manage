package com.kdh.consumemanage.member.repository;

import com.kdh.consumemanage.member.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

    public Member findByUsername(String username);

    public Member findByNickname(String nickname);

}
