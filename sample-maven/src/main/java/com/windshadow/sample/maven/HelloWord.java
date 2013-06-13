package com.windshadow.sample.maven;
/**
 *@Title:  sample-maven
 *@Description:  maven的经典例子
 *@Author:fengzhichao  
 *@Since:2012-8-18  
 *@Version:1.1.0
 */
public class HelloWord {
		
	   /**
	    * @return  返回字符串
	    * @Description:打招呼
	    */
		public  String sayHello(){
			String message ="修改文件的例子！";
			return "你好，我是经典的HelloWord！";
		}
		
		public  static  void  main(String[] args){
			 HelloWord hw = new HelloWord();
			 System.out.println(hw.sayHello());
		}
}
