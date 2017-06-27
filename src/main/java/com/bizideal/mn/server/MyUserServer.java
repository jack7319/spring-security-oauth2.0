package com.bizideal.mn.server;

import java.util.ArrayList;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @author liulq:
 * @data 2017年4月27日 下午9:04:43
 * @version 1.0
 * @Description:TODO
 */
public class MyUserServer implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// 根据用户名查询出用户并返回
		// 202cb962ac59075b964b07152d234b70是123经过MD5加密后的密码
		return new User(username, "202cb962ac59075b964b07152d234b70", new ArrayList<GrantedAuthority>());
	}

}
