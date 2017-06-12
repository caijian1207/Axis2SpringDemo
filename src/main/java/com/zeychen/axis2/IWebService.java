package com.zeychen.axis2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

//@WebService(serviceName = "webService")
//public interface IWebService {
//	@WebMethod
//	public String hello(@WebParam String name, @WebParam Integer age);
//
//	@WebMethod
//	public String working(@WebParam String name, @WebParam String job);
//}
public interface IWebService {
	public String hello(String name, Integer age);

	public String working(String name, String job);
}
