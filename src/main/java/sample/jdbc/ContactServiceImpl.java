package sample.jdbc;

import java.util.List;

public class ContactServiceImpl implements ContactService {

	private ContactDao contactDao;
	public void setContactDao(ContactDao contactDao) {
		this.contactDao = contactDao;
	}

	@Override
	public void addContacts(List<Contact> contacts) {
		// TODO Auto-generated method stub
		for (Contact c: contacts){
			contactDao.addContact(c);
		}
	}

}
