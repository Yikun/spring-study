package com.springstudy.talentshow;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TalentShow {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/springstudy/talentshow/talent-show.xml");
		
		// 使用工厂方法创建Bean, 并设置了初始化和销毁bean
		Stage stage = (Stage) ctx.getBean("stage");
		stage.show();

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
		
		// 使用构造器注入属性和对象引用
		System.out.println("Performer4 start performing:");
		Performer performer4 = (Performer) ctx.getBean("XiaoHong");
		performer4.perform();
		
		// 使用命名空间装配属性
		System.out.println("Performer5 start performing:");
		Performer performer5 = (Performer) ctx.getBean("XiaoHong2");
		performer5.perform();
		
		// 注入内部Bean
		System.out.println("Performer5 start performing:");
		Performer performer6 = (Performer) ctx.getBean("XiaoLi");
		performer6.perform();

		((ClassPathXmlApplicationContext) ctx).close();
	}
}
