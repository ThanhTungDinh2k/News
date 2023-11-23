package com.laptrinhjavaweb.dao;


import com.laptrinhjavaweb.model.UserModel;

public interface IUserDAO extends GrenericDAO<UserModel> {
	UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status);
}
