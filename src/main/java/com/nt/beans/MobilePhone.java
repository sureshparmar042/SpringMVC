package com.nt.beans;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class MobilePhone {
	private String beanId;
public void setBeanId(String beanId) {
		this.beanId = beanId;
	}
public MobilePhone() {
	System.out.println("MobilePhone.MobilePhone()::0-param Constructor.");
}
public void gaming()
{
	 System.out.println("MobilePhone.gaming()::pubg, ludo and etc..");
}

public void shopping()
{
	 System.out.println("MobilePhone.shopping()::Aazon, flipcart and etc..");
}

public void entertaintment()
{
	 System.out.println("MobilePhone.entertaintment()::netflix, prime and etc..");
}

public void calls()
{
	System.out.println("MobilePhone.calls()::incoming and outgoing calls");
}

public void batteryCharging()
{
	
	XmlBeanDefinitionReader reader=null;
	MobilePhoneBatteryCharger charger;
	DefaultListableBeanFactory factory=null;
	System.out.println("MobilePhone.batteryCharging()");
	//2nd IOC container
	factory=new DefaultListableBeanFactory();
	reader=new XmlBeanDefinitionReader(factory);
	reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
	//get dependant bean class object
	charger=factory.getBean(beanId ,MobilePhoneBatteryCharger.class);
	//invoke method
	charger.charging();
}
}
