package com.dao;

import com.model.Users;

/**
 * UsersDao接口
 * 
 * @author dougang
 *
 */
public interface UsersDao {
	/**
	 * 根据username查询记录
	 * 
	 * @param username 用户名
	 * @return 查询结果
	 */
	public Users findByUsername(String username);
}
