package com.Niit.EcomBEnd.Model;

public class BrandModel {
	private int BrandId;
	private String BrandName;
	private String Branddesc;
	public int getBrandId() {
		return BrandId;
	}
	public void setBrandId(int brandId) {
		BrandId = brandId;
	}
	public String getBrandName() {
		return BrandName;
	}
	public void setBrandName(String brandName) {
		BrandName = brandName;
	}
	public String getBranddesc() {
		return Branddesc;
	}
	public void setBranddesc(String branddesc) {
		Branddesc = branddesc;
	}
	public BrandModel(int brandId, String brandName, String branddesc) {
		super();
		BrandId = brandId;
		BrandName = brandName;
		Branddesc = branddesc;
	}
}
