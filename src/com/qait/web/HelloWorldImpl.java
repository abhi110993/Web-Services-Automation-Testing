package com.qait.web;

import javax.jws.WebMethod;
import javax.jws.WebService;  
//Service Implementation  
@WebService(endpointInterface = "com.qait.web.HelloWorld", serviceName="YeServiceNameHai")  
public class HelloWorldImpl implements HelloWorld{  
  @Override  
  public String getHelloWorldAsString(String name) {  
      return "Hello World JAX-WS " + name;  
  }  
  
 @Override
  public int adder(int a, int b){
	  return a+b;
  }
 
 @Override
 public void simplyPrintIt(){
	 System.out.println("Baba ye to print ho gya");
 }
 
 @Override
 public String simplyReturn(){
	 return ("Baba ye to return wala hai");
 }
 
}  