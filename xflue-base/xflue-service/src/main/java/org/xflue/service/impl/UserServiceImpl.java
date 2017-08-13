package org.xflue.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xflue.dao.UserInfoMapper;
import org.xflue.service.UserService;
import org.xflue.vo.UserInfo;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserInfoMapper userInfoMapper;
	
	public String show() {
		UserInfo userInfo = userInfoMapper.selectByPrimaryKey(1);
		return userInfo.getId().toString();
	}

}
