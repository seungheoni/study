package com.practice.impl;

import com.practice.inte.MemberRepository;

public class MemoryMemberRepository implements MemberRepository {

    @Override
    public int save() {
        System.out.println("memory Repository Impl success");
        return 0;
    }
}
