package com.hcentive.spring.test.repo;

import java.util.List;

import com.hcentive.spring.test.domain.Member;

public interface MemberDao
{
    public Member findById(Long id);

    public Member findByEmail(String email);

    public List<Member> findAllOrderedByName();

    public void register(Member member);
}
