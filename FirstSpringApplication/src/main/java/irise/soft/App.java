package irise.soft;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
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
//        System.out.println( "Hello World!" );
    	
    	Resource resource = new ClassPathResource("com/soft/cnfg/applicationContext.xml");
    	
    	BeanFactory factory = new XmlBeanFactory(resource);
    	
    	System.out.println("IOC CONTAINER STARTED BAEANFACTORY USE");
    	
    	Welcome massag = (Welcome) factory.getBean("msg");
        System.out.println(massag.showMassage());
    }
}
