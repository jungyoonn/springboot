package com.eeerrorcode.di.vo;

import java.time.LocalDateTime;
import java.util.Calendar;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    private Long pno;
    private String title;
    private String writer;
    private LocalDateTime regdate;

    // {
    //     Calendar cal = new GregorianCalendar(new Locale("ko"));
    //     Calendar cal = Calendar.getInstance();
    // }
}
