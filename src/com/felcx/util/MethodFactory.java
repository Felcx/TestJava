package com.felcx.util;

import java.lang.reflect.Method;

public class MethodFactory {
	 public void go(){
//		   IBaseExcute justGo=new TestLog4j();
//		   justGo.excuter();			
	   }
	 public void go(String className){
		   String name="com.felcx.method."+className;
		   try {
				Class<?> temp=Class.forName(name);
				Object obj=temp.newInstance();
				Method excuter=temp.getMethod("excuter", null);
				excuter.invoke(obj, null);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   
	   }
}
