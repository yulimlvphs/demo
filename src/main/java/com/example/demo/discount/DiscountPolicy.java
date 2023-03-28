package com.example.demo.discount;

import com.example.demo.member.Member;

public interface DiscountPolicy {
    /*return 값이 할인을 해줄 금액*/
    int discount(Member member, int price);
}
