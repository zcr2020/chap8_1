package com.chap81.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * �����࣬�û��õ�SqlSession
 * @author Administrator
 *
 */
public class MyBatisUtils {
	static SqlSessionFactory  sqlSessionFactory;
	static{
		try {
			Reader  reader=Resources.getResourceAsReader("mybatis-config.xml");
			sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * �õ�SqlSession
	 * @return  SQLSession�Ķ���
	 */
	public static SqlSession getSqlSession(){
		return sqlSessionFactory.openSession();
	}

}
