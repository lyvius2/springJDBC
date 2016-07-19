package sample.jdbc;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ContactService {

	void addContacts(List<Contact> contacts);
}
