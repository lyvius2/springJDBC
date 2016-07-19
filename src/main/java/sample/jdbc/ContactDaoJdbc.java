package sample.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class ContactDaoJdbc implements ContactDao {

	// DI 받기 위한 준비
	private JdbcTemplate template;
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public void addContact(Contact c) {
		// TODO Auto-generated method stub
		String sql = "insert into tb_contact values (?,?,?,?,?,?)";
		template.update(sql, c.getNo(), c.getName(), c.getPhone(), c.getEmail(), c.getAddr(), c.getRegdate());
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		String sql = "delete from tb_contact";
		template.update(sql);
	}

	@Override
	public void deleteByNo(int no) {
		// TODO Auto-generated method stub
		String sql = "delete from tb_contact where contact_no = ?";
		template.update(sql, no);
	}

	@Override
	public void update(Contact c) {
		// TODO Auto-generated method stub
		String sql = "update tb_contact "
				+ "set "
				+ "contact_name = ?,"
				+ "contact_phone = ?,"
				+ "contact_email = ?,"
				+ "contact_addr = ?,"
				+ "where contact_no = ?";
		template.update(sql,
				c.getName(),
				c.getPhone(),
				c.getEmail(),
				c.getAddr(),
				c.getNo());
	}

	@Override
	public List<Contact> selectAll() {
		// TODO Auto-generated method stub
		String sql = "select * from tb_contact";
		List<Contact> contacts = template.query(sql, new ContactRowMapper());
		return contacts;
	}

	@Override
	public Contact selectByNo(int no) {
		// TODO Auto-generated method stub
		String sql = "select * from tb_contact where contact_no = ?";
		Contact c = template.queryForObject(sql, new ContactRowMapper(), no);
		return c;
	}

	class ContactRowMapper implements RowMapper<Contact> {
		@Override
		public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
			Contact c = new Contact();
			c.setNo(rs.getInt("contact_no"));
			c.setName(rs.getString("contact_name"));
			c.setPhone(rs.getString("contact_phone"));
			c.setEmail(rs.getString("contact_email"));
			c.setAddr(rs.getString("contact_addr"));
			c.setRegdate(rs.getDate("contact_regdate"));
			return c;
		}
	}
}
