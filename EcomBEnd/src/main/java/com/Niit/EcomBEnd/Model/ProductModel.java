package com.Niit.EcomBEnd.Model;

public class ProductModel {
private int ProdId;
private String prodName;
private int prodprice;
private int prodqty;
private String proddesc;
public int getProdId() {
	return ProdId;
}
public void setProdId(int prodId) {
	ProdId = prodId;
}
public String getProdName() {
	return prodName;
}
public void setProdName(String prodName) {
	this.prodName = prodName;
}
public int getProdprice() {
	return prodprice;
}
public void setProdprice(int prodprice) {
	this.prodprice = prodprice;
}
public int getProdqty() {
	return prodqty;
}
public void setProdqty(int prodqty) {
	this.prodqty = prodqty;
}
public String getProddesc() {
	return proddesc;
}
public void setProddesc(String proddesc) {
	this.proddesc = proddesc;
}
public ProductModel(int prodId, String prodName, int prodprice, int prodqty, String proddesc) {
	super();
	ProdId = prodId;
	this.prodName = prodName;
	this.prodprice = prodprice;
	this.prodqty = prodqty;
	this.proddesc = proddesc;
}
}
