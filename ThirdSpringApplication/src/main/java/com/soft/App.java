package com.soft;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.soft.beans.Welcome;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
//        Resource rs new ClassPathResource("com/soft/cnfg/applicationContext.xml");
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/soft/cnfg/applicationContext.xml");
        
        Welcome massage = (Welcome) context.getBean("msg");
        System.out.println(massage.showmassage());
        System.out.println(massage.hashCode());
        Welcome massage2 = (Welcome) context.getBean("msg2");
        System.out.println(massage2.showmassage());
        System.out.println(massage2.hashCode());
        
        
    }
}
