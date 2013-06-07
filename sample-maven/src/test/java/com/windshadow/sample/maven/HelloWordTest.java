package com.windshadow.sample.maven;  

import org.junit.Assert;
import org.junit.Test;

/**  
 *@Title:  sample-maven
 *@Description:  HelloWord测试用例
 *@Author:fengzhichao  
 *@Since:2012-8-18  
 *@Version:1.1.0  
 */
public class HelloWordTest {
		@Test
		public  void  testSayHello(){
				HelloWord	hw =	 new HelloWord();
				Assert.assertEquals("你好，我是经典的HelloWord！", hw.sayHello());
		}
}
