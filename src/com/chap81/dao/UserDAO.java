package com.chap81.dao;

import java.util.List;

import com.chap81.domain.Users;

/**
 * UserDAO接口，提供查询用户信息的方法
 * @author Administrator
 *
 */
public interface UserDAO {
	/**
	 * 返回包含users中信息的所有用户信息
	 * @param users
	 * @return
	 */
	public List<Users>  listUsersByCondition(Users users);
}
