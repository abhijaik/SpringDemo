package com.abhi.samples.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abhi.samples.SpringDemo.constructordi.Customer;
import com.abhi.samples.SpringDemo.setterdi.ReportHelper;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context =  new ClassPathXmlApplicationContext("SpringBeans.xml");
		ReportHelper reportHelper = (ReportHelper)context.getBean("rHelper");
		reportHelper.generateReport();
		
		Customer customer = (Customer)context.getBean("cust");
		System.out.println(customer.toString());
    }
}
