package org.springframework.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {
	public static void main(final String[] args) throws Exception {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(TxConfig.class);
		FooService defaultFooService = (FooService) ctx.getBean("defaultFooService");
		FooService fooService1 = ctx.getBean(FooService.class);
//		FooService fooService2 = ctx.getBean(DefaultFooService.class);
		fooService1.insertFoo(new Foo());
		System.out.println("Ending transaction...");
	}
}