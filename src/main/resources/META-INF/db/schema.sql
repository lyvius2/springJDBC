create table tb_contact(

	contact_no integer primary key,
	contact_name varchar(100) not null,
	contact_phone varchar(20) not null,
	contact_email varchar(200),
	contact_addr varchar(200),
	contact_regdate date
	
);