package com.aaditya.dsa.blog.payloads;

import java.util.Date;

import com.aaditya.dsa.blog.entities.Category;
import com.aaditya.dsa.blog.entities.User;

public class PostDto {

	 private String title;
	 private String content;
	 
	 private String imageName;
	 
	 private Date addedDate;
	 
	 private Category category;
	 private User user;
	 

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	 
	 
}
