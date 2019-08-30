package com.form;

import java.util.List;  
import java.sql.*;
import com.form.booking;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;  

public class bookingjdbc {
	JdbcTemplate template;  
	  
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  
	public int save(booking p){  
	    String sql="insert into booking(Id,Name,Address) values("+p.getId()+",'"+p.getName()+"','"+p.getAddress()+"')";  
	    return template.update(sql);  
	}  
	public int update(booking p){  
	    String sql="update booking set Name='"+p.getName()+"', Id="+p.getId()+",Address='"+p.getAddress()+"' where id="+p.getId()+"";  
	    return template.update(sql);  
	}  
	public int delete(int id){  
	    String sql="delete from booking where id="+id+"";  
	    return template.update(sql);  
	}  
	public booking getbookingById(int id){  
	    String sql="select * from booking where id=?";  
	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<booking>(booking.class));  
	}  
	public List<booking> getbooking(){  
	    return template.query("select * from booking",new RowMapper<booking>(){  
	        public booking mapRow(ResultSet rs, int row) throws SQLException {  
	            booking e=new booking();  
	            e.setId(rs.getInt(1));  
	            e.setName(rs.getString(2));  
	            e.setAddress(rs.getString(3));    
	            return e;  
	        }  
	    });  
	}  
}
