package org.dxc.hibernate.service;

public interface EmployeeDaoIntf {
	public long addEmployee(String name,java.sql.Date joining,double salary);
	public org.dxc.hibernate.model.Employee updateEmployee(long id,
			org.dxc.hibernate.model.Employee employee);
	
	public boolean removeEmployee(long id);
	
	public java.util.List<org.dxc.hibernate.model.Employee>getAllEmplloyees();
	public org.dxc.hibernate.model.Employee getEmployeeById(long id);
	
	
	

}
