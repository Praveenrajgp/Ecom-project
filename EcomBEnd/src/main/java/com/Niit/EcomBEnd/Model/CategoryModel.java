package com.Niit.EcomBEnd.Model;

public class CategoryModel {
	private int CategoryId;
	private String CategoryName;
	private String Categorydesc;
	public int getCategoryId() {
		return CategoryId;
	}
	public void setCategoryId(int categoryId) {
		CategoryId = categoryId;
	}
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	public String getCategorydesc() {
		return Categorydesc;
	}
	public void setCategorydesc(String categorydesc) {
		Categorydesc = categorydesc;
	}
	public CategoryModel(int categoryId, String categoryName, String categorydesc) {
		super();
		CategoryId = categoryId;
		CategoryName = categoryName;
		Categorydesc = categorydesc;
	}
}
