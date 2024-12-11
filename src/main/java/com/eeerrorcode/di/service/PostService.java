package com.eeerrorcode.di.service;

import java.util.List;

import com.eeerrorcode.di.vo.Post;

public interface PostService {
    default void write(Post post) {
        
    }
    List<Post> list();
}
