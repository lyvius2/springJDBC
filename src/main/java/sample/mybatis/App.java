package sample.mybatis;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import sample.jdbc.Contact;

public class App {

	public static void main(String[] args) {
		String resource = "classpath:/sample/mybatis/context-mybatis.xml";
		
		ApplicationContext context = new GenericXmlApplicationContext(resource);
		
		ContactRepository repo = context.getBean(ContactRepository.class);
		
		List<Contact> contact = repo.selectAll();
		System.out.println("연락처 갯수 : " + contact.size());
	}
}
