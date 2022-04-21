package com.practice.impl;

import com.practice.inte.MemberRepository;

public class JdbcMemberRepository implements MemberRepository {

    @Override
    public int save() {
        System.out.println("jdbc Repository Impl success");
        return 0;
    }
}
