package com.mtc.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.bhargav.svina.messenger.database.iEmployeeDAO;

public class EmployeeDAO {
	
	public class employeeDAO extends EmployeeBaseDAO implements iEmployeeDAO{

		@Override
		public Employee getEmployeeById(int id) {
			
			Employee employee = null;
			
			try{
				
				Connection connection = getConnection();
			
				String query = "select * from test.employee where id=?";
				
				PreparedStatement preparedStatement = connection.prepareStatement(query);
				
				preparedStatement.setInt(1,id);
				
				ResultSet resultSet = preparedStatement.executeQuery();
				
				if (resultSet.next()) {
				
					employee = new Employee();
					
					employee.setId(resultSet.getInt("id"));
					employee.setName(resultSet.getString("name"));
					employee.setPhno(resultSet.getInt("phno"));
					
				}
				
			}catch(Exception e){
				e.printStackTrace();
			}
				
			return employee;
		}
		
	}

}
