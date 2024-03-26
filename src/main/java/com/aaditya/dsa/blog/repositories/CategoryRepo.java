package com.aaditya.dsa.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aaditya.dsa.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category,Integer>{

}
