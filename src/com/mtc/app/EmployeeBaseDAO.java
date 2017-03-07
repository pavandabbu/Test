package com.mtc.app;

import java.sql.Connection;
import java.sql.DriverManager;

public class EmployeeBaseDAO {
	public Connection getConnection(){
		
		Connection connection = null;
		
		try{			
			
			Class.forName("org.gjt.mm.mysql.Driver");			
		  
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return connection;
	}
}
