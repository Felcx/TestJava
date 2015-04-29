package com.felcx.main;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



import com.felcx.util.FelcxFactory;
import com.felcx.util.MethodFactory;





public class HelloWorld {
	
    public static void main(String[] args){
    	System.out.println("Hello word");
    	FelcxFactory factory=new FelcxFactory();
    	MethodFactory factory2=new MethodFactory();
    	factory.go("TestLog4j");
    	//factory2.go("ShowFiles");
    }
}
