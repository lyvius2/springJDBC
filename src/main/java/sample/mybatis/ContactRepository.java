package sample.mybatis;

import java.util.List;

import sample.jdbc.Contact;

public interface ContactRepository {

	void addContact(Contact c);
	void deleteAll();
	void deleteByNo(int no);
	void update(Contact c);
	List<Contact> selectAll();
	Contact selectByNo(int no);
}
