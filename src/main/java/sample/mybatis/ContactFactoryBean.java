package sample.mybatis;

import org.springframework.beans.factory.FactoryBean;

import sample.jdbc.Contact;

public class ContactFactoryBean implements FactoryBean<Contact> {

	@Override
	public Contact getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Contact();
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Contact.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
