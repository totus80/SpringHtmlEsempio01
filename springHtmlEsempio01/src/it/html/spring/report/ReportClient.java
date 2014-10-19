package it.html.spring.report;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.ClassPathResource;

public class ReportClient {
	
	public static void main(String[] args) {

		String data = null;
		
		BeanFactory ctx = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        
		ReportGenerator gen = (ReportGenerator) ctx.getBean("reportGenerator");
	    
		gen.generate(data).saveToFile();
	}
}
