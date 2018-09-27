package com.Niit.EcomBEnd.Dao;

import java.util.List;

import com.Niit.EcomBEnd.Model.ProductModel;

public interface ProductDao {
	public boolean AllProduct(ProductModel obj);
	public boolean UpdateProduct(ProductModel obj);
	public boolean DeleteProduct(ProductModel obj);
	public List<ProductModel> SelectBranf(int prodid);
	public List<ProductModel> SelectAllBranf(ProductModel obj);
}
