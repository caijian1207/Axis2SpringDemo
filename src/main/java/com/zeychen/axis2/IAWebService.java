package com.zeychen.axis2;

import org.springframework.stereotype.Component;

@Component("springWebService")
public interface IAWebService {
	
	public String hello(String name, Integer age);

	public String working(String name, String job);
}
