package com.springcore.lifecycle;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		//LifeCycle	 lifecycle=(LifeCycle)context.getBean("lifecycle");//Bean is retrieved using context
//		System.out.println("Value is "+lifecycle);

		
		//registering shut down hook 
		context.registerShutdownHook();//to call destroy method we need abstract application context
	//	LifecycleInterface lifecycleinterface=(LifecycleInterface)context.getBean("lifecycleinterface");
		//System.out.println(lifecycleinterface);
		
		Annotatons annotatons=(Annotatons)context.getBean("annotations");
		System.out.println(annotatons);
	}

}
