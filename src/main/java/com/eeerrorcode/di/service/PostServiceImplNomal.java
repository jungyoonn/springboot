package com.eeerrorcode.di.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.eeerrorcode.di.vo.Post;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service("normal")
public class PostServiceImplNomal implements PostService {

    @Override
    public void write(Post post) {
        log.info(getClass().getSimpleName() + ".write() call");
    }

    @Override
    public List<Post> list() {
        List<Post> list = new ArrayList<>();
        list.add(Post.builder().pno(1L).title("일반 게시판 제목").writer("작성자").build());
        list.add(Post.builder().pno(2L).title("일반 게시판 제목2").writer("작성자2").build());
        return list;
    }
    
}
