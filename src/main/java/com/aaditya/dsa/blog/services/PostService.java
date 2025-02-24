package com.aaditya.dsa.blog.services;

import java.util.List;

import com.aaditya.dsa.blog.entities.Post;
import com.aaditya.dsa.blog.payloads.PostDto;

public interface PostService {

	//create
	PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);
	
	//update
	Post updatePost(PostDto postDto, Integer postId);
	
	//delete
	void deletePost(Integer postId);
	
	//get all posts
	List<Post> getAllPost();
	
	//get single post
	Post getPostBYId(Integer postId);
	
	//get all post by category
	List<PostDto> getPostsByCategory(Integer categoryId);
	
	//get all posts by user
	List<PostDto> getPostsByUser(Integer userId);
	
	//search posts
	List<Post> searchPosts(String Keyword);
	
}
