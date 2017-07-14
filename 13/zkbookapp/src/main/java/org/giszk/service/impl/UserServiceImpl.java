package org.giszk.service.impl;

import org.giszk.domain.User;
import org.giszk.mapper.UserMapper;
import org.giszk.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;

/**
 * User服务层接口实现类
 * @Service("userService")用于将当前类注释为一个Spring的bean， 名为userService
 * 
 * @author zhangke
 *
 */
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("userService")
public class UserServiceImpl implements UserService {
	/**
	 * 自动注入UserMapper
	 */
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * UserService接口的login方法实现 
	 * @see { UserService }
	 */
	@Transactional(readOnly = true)
	public User login(String loginname, String password) {
		return userMapper.findWithLoginnameAndPassword(loginname, password);
	}

}
