package com.Niit.EcomBEnd.Dao;

import java.util.List;

import com.Niit.EcomBEnd.Model.CategoryModel;

public interface CategoryDao {
	public boolean AllCategory(CategoryModel obj);
	public boolean UpdateCategory(CategoryModel obj);
	public boolean DeleteCategory(CategoryModel obj);
	public List<CategoryModel> SelectBranf(int prodid);
	public List<CategoryModel> SelectAllBranf(CategoryModel obj);
}
