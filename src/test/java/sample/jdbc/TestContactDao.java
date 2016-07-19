package sample.jdbc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


/*
 * JUnit을 활용한 단위테스트 하기
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/sample/jdbc/jdbc-context-test.xml"})
@Transactional
public class TestContactDao {

	@Autowired
	ContactDao dao;
	
	// tb_contact 연락처 저장 작업에 대한 단위테스트
	@Test
	public void testAddContact(){
		Contact c = new Contact();
		c.setNo(300);
		c.setName("가나다라");
		c.setPhone("010-111-1111");
		c.setEmail("ka@gmail.com");
		c.setAddr("서울");
		c.setRegdate(new Date());
		
		dao.addContact(c);
		List<Contact> contacts = dao.selectAll();
		
		Assert.assertEquals(4, contacts.size());
	}
	
	// 전체 연락처 조회 작업에 대한 단위테스트
	@Test
	public void testSelectAllContacts(){
		
	}
}
