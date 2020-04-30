package com.example.dao;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.List;  
import org.springframework.jdbc.core.BeanPropertyRowMapper;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;  
import com.example.model.Trainee;  
  
public class TraineeDaoimpl {  
JdbcTemplate template;  
  
public void setTemplate(JdbcTemplate template) {  
    this.template = template;  
}  
public int save(Trainee p){  
    String sql="insert into Emp99(name,salary,designation) values('"+p.getTraineeid()+"',"+p.getTraineename()+",'"+p.getTraineedomain()+"',"+p.getTraineelocation()+"')";  
    return template.update(sql);  
}  
public int update(Trainee p){  
    String sql="update Emp99 set name='"+p.getTraineeid()+"',"+p.getTraineename()+",'"+p.getTraineedomain()+"',"+p.getTraineelocation()+"'+ where id="+p.getTraineeid()+"";  
    return template.update(sql);  
}  
public int delete(int id){  
    String sql="delete from Emp99 where id="+id+"";  
    return template.update(sql);  
}  
public Trainee getEmpById(int id){  
    String sql="select * from Emp99 where id=?";  
    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Trainee>(Trainee.class));  
}  
public List<Trainee> getEmployees(){  
    return template.query("select * from Emp99",new RowMapper<Trainee>(){  
        public Trainee mapRow(ResultSet rs, int row) throws SQLException {  
            Trainee e=new Trainee();  
            e.setTraineeid(rs.getInt(1));  
            e.setTraineename(rs.getString(2));  
            e.setTraineedomain(rs.getString(3));  
            e.setTraineelocation(rs.getString(4));  
            return e;  
        }  
    });  
}  
}  