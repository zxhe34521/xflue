package org.xflue.dao;

import org.xflue.vo.UserInfo;



public interface UserInfoMapper {

    UserInfo selectByPrimaryKey(Integer id);

}