package com.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UsersDao;
import com.model.Users;
import com.service.UsersService;

/**
 * UsersService实现类
 * 
 * @author dougang
 *
 */
@Service("usersService")
@Transactional
public class UsersServiceImpl implements UsersService {

	@Resource(name = "usersDao")
	private UsersDao usersDao;

	public UsersDao getUsersDao() {
		return usersDao;
	}

	public void setUsersDao(UsersDao usersDao) {
		this.usersDao = usersDao;
	}

	/**
	 * 根据username进行登录查询验证
	 * 
	 * @param username 用户名
	 * @return 验证查询结果
	 */
	public Users loginValidate(String username) {
		return this.usersDao.findByUsername(username);
	}

}
