package com.chap81.dao.impl;

import java.util.List;
import java.util.Properties;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.chap81.dao.UserDAO;
import com.chap81.domain.Users;
import com.chap81.util.MyBatisUtils;
/**
 * UserDAOImpl��ʵ��UserDAO�ӿڣ���MyBatis���ʵ���û���¼��֤ 
 * @author Administrator
 *
 */
@Repository("userDao")
public class UserDAOImpl implements UserDAO {
	
	@Override
	public List<Users> listUsersByCondition(Users users) {
		SqlSession sqlSession=MyBatisUtils.getSqlSession();
		List<Users> usersList=sqlSession.selectList("com.chap81.mapper.UsersMapper.listUsersByCondition", users);
		sqlSession.close();
		return usersList;
	}
}
