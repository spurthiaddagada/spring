package org.spurthi.geek;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {
	
	public static void main(String args[])
	{
		
		//Triangle triangle= new Triangle();
		/*
		 * Application factory has BeanFactory functionalities+additional
		 * BeanFactory is only used in resource critical applications
		*/
		
		//BeanFactory factory= new XmlBeanFactory(new FileSystemResource("spring.xml"));
		
		
	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	
	
		Triangle  triangle=(Triangle) context.getBean("triangle");
		triangle.draw();
//		
//		Triangle  triangle1=(Triangle) context.getBean("triangle1");
//		triangle1.draw();
//		
//		Triangle  triangle2=(Triangle) context.getBean("triangle2");
	//	triangle2.draw();
		
		
//		Point p1= new Point();
//		p1.setX(2);
//		p1.setY(2);
//		
//		Point p2= new Point();
//		p2.setX(1);
//		p2.setY(1);
//		
//		Point p3= new Point();
//		p3.setX(3);
//		p3.setY(3);
//		
//		Triangle t1= new Triangle();
//		t1.setPointA(p1);
//		
//		
//		t1.setPointB(p2);
//
//		t1.setPointC(p3);
//		t1.draw();
		
		
	}
	
	

}
