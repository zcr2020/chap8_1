package com.chap81.dao;

import java.util.List;

import com.chap81.domain.Users;

/**
 * UserDAO�ӿڣ��ṩ��ѯ�û���Ϣ�ķ���
 * @author Administrator
 *
 */
public interface UserDAO {
	/**
	 * ���ذ���users����Ϣ�������û���Ϣ
	 * @param users
	 * @return
	 */
	public List<Users>  listUsersByCondition(Users users);
}
