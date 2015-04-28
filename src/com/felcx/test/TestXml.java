package com.felcx.test;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import com.felcx.interfaces.IBaseExcute;

public class TestXml implements IBaseExcute {
    
	private void withDom() throws ParserConfigurationException{
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		DocumentBuilder db=dbf.newDocumentBuilder();
	}
	@Override
	public void excuter() throws Exception {
		System.out.println("hello");
	}

}
