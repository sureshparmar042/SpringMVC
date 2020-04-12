package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.MobilePhone;

public class DependancyLookupTest {
 
	public static void main(String[] args) {
		//create IOC Container
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		MobilePhone phone1=null;
		//1syt IOC Conatiner 
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
 		////get target bean clasc object
        phone1=factory.getBean("phone", MobilePhone.class);
        //invoke methods
        phone1.batteryCharging();
        phone1.calls();
        phone1.entertaintment();
        phone1.gaming();
        phone1.shopping();
	}

}
