package com.soft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.soft.beans.WelcomeMassageGenerator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
  
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/soft/cnfg/applicationContext.xml");
    	System.out.println("IOC container Started using Constructor-arg");
    	
    	WelcomeMassageGenerator Genertaor = (WelcomeMassageGenerator) context.getBean("massageGenrator");
    	System.out.println("Massage::"+ Genertaor.massageGenrator("Sanket"));
    	
    }
}
