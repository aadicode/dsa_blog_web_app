package com.aaditya.dsa.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aaditya.dsa.blog.entities.Category;
import com.aaditya.dsa.blog.entities.Post;
import com.aaditya.dsa.blog.entities.User;

public interface PostRepo extends JpaRepository<Post,Integer> {

	List<Post> findByUser(User user);
	
	List<Post> findByCategory(Category category);
}
