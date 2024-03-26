package com.aaditya.dsa.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aaditya.dsa.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
