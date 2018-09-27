package com.Niit.EcomBEnd.Dao;


import java.util.List;

import com.Niit.EcomBEnd.Model.UserModel;

public interface UserDao {
public boolean AllUser(UserModel obj);
public boolean UpdateUser(UserModel obj);
public boolean DeleteUser(UserModel obj);
public List<UserModel> SelectBranf(int prodid);
public List<UserModel> SelectAllBranf(UserModel obj);

}
