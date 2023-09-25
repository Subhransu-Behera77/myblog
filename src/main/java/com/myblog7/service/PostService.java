package com.myblog7.service;

import com.myblog7.payload.PostDto;
import com.myblog7.payload.PostResponse;

public interface PostService {
    PostDto savePost(PostDto postDto);

    void deletePost(Long id);

    PostDto updatePost(Long id, PostDto postDto);

    PostDto getPostById(Long id);


    PostResponse getPosts(int pageNo, int pageSize, String sortBy, String sortDir);
}
