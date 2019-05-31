package com.pawana.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.pawana.empdtls.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	private NamedParameterJdbcTemplate jt;
	
	
	public void setJt(NamedParameterJdbcTemplate jt) {
		this.jt = jt;
	}

	private final String getEmployeeById="select * from emp1 where employee_id=:empId";
	private final String getAllEmployees="select * from emp1";
	
	@Override
	public Employee getEmployeeById(int id) {
		SqlParameterSource namedParameters = new MapSqlParameterSource("empId", id);
		Employee emp=(Employee) jt.queryForObject(getEmployeeById,namedParameters, new EmployeeRowMapper());
		return emp;
	}
	
	class EmployeeRowMapper implements RowMapper<Employee>{

		@Override
		public Employee mapRow(ResultSet rs, int pos) throws SQLException {
			Employee emp=new Employee(rs.getString(1),rs.getInt(2),rs.getInt(3),rs.getInt(4));
			
			return emp;
		}
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> emps= jt.query(getAllEmployees, new ResultSetExtractor<List<Employee>>() {

			@Override
			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Employee> list=new ArrayList<>();
				while(rs.next()) {
					Employee emp=new Employee();
					emp.setName(rs.getString(1));
					emp.setId(rs.getInt(2));
					emp.setSalary(rs.getInt(3));
					emp.setAge(rs.getInt(4));
					list.add(emp);
				}
				
				return list;
			}
			
		}
				);
		return emps;
	}

}
