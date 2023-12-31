package com.example.porfolio_hisab.service;

import java.util.List;

import com.example.porfolio_hisab.dto.CategoryInputDto;
import com.example.porfolio_hisab.entity.Category;

public interface ICategoryService {
	public String addCategory(CategoryInputDto catName);
	public List<Category> viewAllCategory();
	public String deleteCategory(long id);
	public Category viewCategory(long id); 
}
