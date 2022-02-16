package com.mondee;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {

	public static void main(String args[]) {

		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		Car cr = (Car) ac.getBean("nano");
		cr.move();
		Bus b = (Bus) ac.getBean("Apache");
		b.move();

}
}