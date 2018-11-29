package com.service;

import com.model.Users;

/**
 * UsersService接口
 * 
 * @author dougang
 *
 */
public interface UsersService {

	/**
	 * 根据username进行登录查询验证
	 * 
	 * @param username 用户名
	 * @return 验证查询结果
	 */
	public Users loginValidate(String username);
}
