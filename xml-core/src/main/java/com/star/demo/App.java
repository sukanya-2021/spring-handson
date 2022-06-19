package com.star.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// Normal object creation
		Employee e = new Employee("RP");
		e.setAge(32);

		// Container based object creations
		Resource res = new ClassPathResource("beans.xml");
		BeanFactory container = new XmlBeanFactory(res);//
		Employee e1 = container.getBean(Employee.class); // int total = sum(10,20);
		System.out.println(e1.getName());
		System.out.println(e1.getAge());

	}
}
