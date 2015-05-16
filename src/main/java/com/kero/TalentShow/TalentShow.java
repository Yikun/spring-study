package com.kero.TalentShow;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TalentShow {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/kero/TalentShow/talent-show.xml");
		
		// 使用默认构造器
		System.out.println("Performer1 start performing:");
		Performer performer1 = (Performer) ctx.getBean("LiLei");
		performer1.perform();
		
		// 使用构造器注入
		System.out.println("Performer2 start performing:");
		Performer performer2 = (Performer) ctx.getBean("HanMeimei");
		performer2.perform();
		
		// 使用构造器注入对象引用
		System.out.println("Performer3 start performing:");
		Performer performer3 = (Performer) ctx.getBean("XiaoMing");
		performer3.perform();
	}
}
