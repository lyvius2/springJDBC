package sample.jdbc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		String resource = "classpath:/sample/jdbc/jdbc-context.xml";
		ApplicationContext context = new GenericXmlApplicationContext(resource);
		
		ContactDao dao = context.getBean(ContactDao.class);
		List<Contact> contacts = dao.selectAll();
		System.out.println("연락처 갯수 : " + contacts.size());
		
		/*
		ContactService service = context.getBean(ContactService.class);
		List<Contact> contacts = new ArrayList<Contact>();
		Contact c1 = new Contact();
		c1.setNo(201);
		c1.setName("가나다");
		c1.setPhone("010-888-8888");
		
		Contact c2 = new Contact();
		c2.setNo(203);
		c2.setName("라마바");
		c2.setPhone("010-999-9999");
		
		contacts.add(c1);
		contacts.add(c2);
		
		service.addContacts(contacts);
		
		ContactDao dao = context.getBean(ContactDao.class);
		System.out.println("연락처 갯수 : " + dao.selectAll().size());
		*/
		
	}
}
