package com.Niit.EcomBEnd.Dao;

import java.util.List;

import com.Niit.EcomBEnd.Model.BrandModel;

public interface BrandDao {
	public boolean AllBrand(BrandModel obj);
	public boolean UpdateBrand(BrandModel obj);
	public boolean DeleteBrand(BrandModel obj);
	public List<BrandModel> SelectBranf(int prodid);
	public List<BrandModel> SelectAllBranf(BrandModel obj);
}
