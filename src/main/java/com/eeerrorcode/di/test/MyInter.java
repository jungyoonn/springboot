package com.eeerrorcode.di.test;

@FunctionalInterface
public interface MyInter {
    // 함수형 인터페이스는 추상 메서드가 반드시 "1개" 존재해야 한다
    Integer run(String str);

    default Integer de(String str) {
        return Integer.parseInt(str);
    }

    static Integer sm(String str) {
        return Integer.parseInt(str);
    }
}
