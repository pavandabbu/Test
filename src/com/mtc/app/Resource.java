package com.mtc.app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("resource")
public class Resource {
 	
	private EmployeeDAO employeeDAO;

	public Resource(){
		
		employeeDAO = new EmployeeDAO();
	}
	
	@GET
	//@Path("/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	//public Employee fetchEmployeeById(@PathParam("id")int id){
		public String fetchEmployeeById(){
		System.out.println("test");
		//Employee employee = ((iEmployeeDAO) employeeDAO).getEmployeeById(id);
		 return "kk";
	//	return employee;
		
	}
}
