package com.practice.springpra;

import com.practice.impl.JdbcMemberRepository;
import com.practice.impl.MemoryMemberRepository;
import com.practice.inte.MemberRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SolidTest {

    @Test
    @DisplayName("다형성 테스트 코드")
    public void test() {

        /*
            인터페이스 구현체가 변경될때 클라이언트 코드 (SolidTest.class)가 변경되어야한다.
            따라서 기존 객체 지향 개념으로는 완벽한 Solid 설계를 할 수 없음. 클라이언트 코드가 변경되기 떄문에
            이 개념에 스프링이 필요한 것 임.
         */
        //MemberRepository memberRepository = new MemoryMemberRepository();
        MemberRepository memberRepository = new JdbcMemberRepository();
        memberRepository.save();
    }
}
