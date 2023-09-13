package com.blog.services;

import java.util.List;

import com.blog.payloads.CategoryDto;

public interface CategoryService {

	//create
	 CategoryDto createCategory(CategoryDto categoryDto);
	
	//update
	 CategoryDto updateUser(CategoryDto categoryDto,Integer categoryId);
	 //Delete
	 void deleteCategory(Integer categoryId);
	 //Get
	 CategoryDto getSingleCategory(Integer categoryId);
	 //get all
	 List<CategoryDto> getAllCategory();
	
	
}
