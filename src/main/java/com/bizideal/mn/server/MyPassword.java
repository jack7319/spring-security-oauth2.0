package com.bizideal.mn.server;

import org.springframework.security.crypto.password.PasswordEncoder;

import com.bizideal.mn.utils.MD5;

/**
 * @author liulq:
 * @data 2017年4月27日 下午8:42:18
 * @version 1.0
 * @Description:TODO
 */
public class MyPassword implements PasswordEncoder {

	@Override
	public String encode(CharSequence rawPassword) {
		return null;
	}

	// rawPassword是用户输入密码
	// encodedPassword是数据库中查询出来的密码，假设系统使用MD5加密
	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		return MD5.getMD5(rawPassword.toString()).equals(encodedPassword);
	}

}
