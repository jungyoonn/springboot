package com.eeerrorcode.di.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Stream.of(1,2,3,4,5).toList());
        log.info(list);
        
        Comparator<Integer> c = (a, b) -> b - a;
        list.sort(c);
        log.info(list);

        list.sort((a, b) -> b - a);
        log.info(list);

        // 익명 클래스
        // static은 오버라이딩이 안 됨
        MyInter myInter = new MyInter() {
            public Integer run(String str) {
                return 10;
            }

            public Integer de(String str) {
                return 20;
            }
        };

        // default의 특징
        log.info(myInter.de("")); // 오버라이딩 된 메서드가 호출된다
        log.info(myInter.de("100")); // 오버라이딩 되지 않은 기존 메서드가 호출된다

        log.info(myInter.run(""));

        log.info(MyInter.sm("30"));

        MyInter myInter2 = a -> 50;
        log.info(myInter2.run(null)); // 50
    }
}
