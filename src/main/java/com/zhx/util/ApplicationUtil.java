package com.zhx.util;

import java.util.UUID;

import org.apache.commons.codec.digest.DigestUtils;

public class ApplicationUtil {
	public static final String getRandom32UUID(){
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		return uuid;
	}
	
	public static String md5Hex(String value) {
	    return DigestUtils.md5Hex(value);
    }

	public static String pwd(String password) {
		return md5Hex(md5Hex(password)+md5Hex(password));
	}
	
	public static void main(String[] args) {
		String pwd = ApplicationUtil.pwd("123456");
		System.out.println(pwd);
	}
}
