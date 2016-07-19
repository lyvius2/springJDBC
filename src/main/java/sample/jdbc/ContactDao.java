package sample.jdbc;

import java.util.List;

public interface ContactDao {

	void addContact(Contact c);
	void deleteAll();
	void deleteByNo(int no);
	void update(Contact c);
	List<Contact> selectAll();
	Contact selectByNo(int no);
}
