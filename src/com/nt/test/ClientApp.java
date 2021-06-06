package com.nt.test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;
public class ClientApp {
	public static void main(String[] args) {
		System.out.println("ClientApp:main(-)");
		Resource res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		BeanFactory factory= new XmlBeanFactory(res);
		//WishGenerator bean=(WishGenerator)factory.getBean("wsg");
		WishMessageGenerator bean=factory.getBean("wsg",WishMessageGenerator.class);
		String result=bean.generateWishMsg();
		System.out.println(result);
	}

}
