package com.eeerrorcode.di.service;

import java.util.List;

import com.eeerrorcode.di.vo.Post;

public interface PostService {
    void write(Post post);
    List<Post> list();
}
