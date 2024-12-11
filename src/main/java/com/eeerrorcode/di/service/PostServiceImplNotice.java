package com.eeerrorcode.di.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.eeerrorcode.di.vo.Post;

import lombok.extern.log4j.Log4j2;

@Log4j2
// @Service("notice")
@Configuration // @Bean을 사용하려면 @Configuration이랑 같이 써야 함
public class PostServiceImplNotice implements PostService {

    @Override
    public void write(Post post) {
        log.info(getClass().getSimpleName() + ".write() call");
    }

    @Override
    public List<Post> list() {
        List<Post> list = new ArrayList<>();
        list.add(Post.builder().pno(5L).title("공지 게시판 제목").writer("작성자").build());
        list.add(Post.builder().pno(6L).title("공지 게시판 제목2").writer("작성자2").build());
        return list;
    }
    
    @Bean("notice") // 이름을 정의하지 않으면 해당 메서드/클래스의 이름을 카멜로 바꿔서 이름으로 씀
    public PostService postService() {
        return new PostServiceImplNotice();
    }
}
