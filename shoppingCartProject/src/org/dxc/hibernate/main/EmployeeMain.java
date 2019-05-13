package org.dxc.hibernate.main;

public class EmployeeMain {
	public static void main(String args[]){
		org.dxc.hibernate.service.EmployeeDaoIntf dao=new
				org.dxc.hibernate.service.EmployeeDao();
		java.util.List<org.dxc.hibernate.model.Employee>employee=
				dao.getAllEmployees();
		
		for(org.dxc.hibernate.model.Employee employee:employees){
			System.out.println(employees);
			
		}
		
	}

}
