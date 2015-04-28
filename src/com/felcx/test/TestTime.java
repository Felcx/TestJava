package com.felcx.test;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.felcx.interfaces.IBaseExcute;

public class TestTime implements IBaseExcute{
    
	/**
	 * 获取当前时间戳的3种方法
	 */
	private void comparer(){
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS");
		long mSystem=System.currentTimeMillis();
		long mDate=new Date().getTime();
		long mCalender=Calendar.getInstance().getTimeInMillis();
		System.out.println("system:"+mSystem+"\t"+format.format(new Date(mSystem)));
		System.out.println("Date:"+mDate+"\t"+format.format(new Date(mDate)));
		System.out.println("Calender"+mCalender+"\t"+format.format(new Date(mCalender)));
	}
	
	/**
	 * 把string字符串转为date类型
	 * @throws ParseException 
	 */
	private void stringToDate() throws ParseException{
//		String time="1991年08月18日 12点12分12秒";
//		SimpleDateFormat format=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
		String time="1991-08-18 12:12:12";
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date birthDay=format.parse(time);		
	}
	
	/**
	 * 日期类型的默认输出格式 
	 */
	private void display(){
		long stamp=System.currentTimeMillis();
		System.out.println("Timestamp:"+new Timestamp(stamp));
		System.out.println("Date:"+new Date(stamp));
		Calendar calendar=Calendar.getInstance();
		calendar.setTimeInMillis(stamp);
		System.out.println("Calendar:"+calendar.toString());
	}
	
	@Override
	public void excuter() throws Exception{		
	display();
	}

}
/*
SimpleDateFormat日期-时间格式模式参数：
字母  日期或时间元素 表示  示例  
G  Era 标志符  Text  AD  
y  年  Year  1996; 96 
M  年中的月份  Month  July; Jul; 07 
w  年中的周数  Number  27 
W  月份中的周数  Number  2 
D  年中的天数  Number  189 
d  月份中的天数  Number  10 
F  月份中的星期  Number  2 
E  星期中的天数  Text  Tuesday; Tue （我在部署的时候在本机oracle是返回星期是星期二，而在Oracle的服务器上是返回Tue.)  
a  Am/pm 标记  Text  PM  
H  一天中的小时数（0-23）  Number  0 
k  一天中的小时数（1-24）  Number  24 
K  am/pm 中的小时数（0-11）  Number  0 
h  am/pm 中的小时数（1-12）  Number  12 
m  小时中的分钟数  Number  30 
s  分钟中的秒数  Number  55 
S  毫秒数  Number  978 
z  时区  General time zone  Pacific Standard Time; PST; GMT-08:00 
Z  时区  RFC 822 time zone  -0800 
*/