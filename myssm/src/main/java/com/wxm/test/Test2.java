package com.wxm.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wxm.dao.UserDao;



@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class Test2 {
	@Resource
	private UserDao userDao;
	@Test
	public void testt(){
		System.out.println(userDao.getById(2).getUserName());
	}
	
}
