package org.dxc.hibernate.service;

import java.sql.Date;
import java.util.List;

import org.dxc.hibernate.model.Employee;

public class EmployeeDao implements EmployeeDaoIntf{

	@Override
	public long addEmployee(String name, Date joining, double salary) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public org.dxc.hibernate.model.Employee updateEmployee(long id, org.dxc.hibernate.model.Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeEmployee(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Employee> getAllEmplloyees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public org.dxc.hibernate.model.Employee getEmployeeById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	


@Override
public java.util.List<org.dxc.hibernate.model.Employee> getAllEmployees(){
	org.hibernate.SessionFactory sessionFactory=
			org.dxc.hibernate.util.HibernateUtil.buildSessionFactory();
	org.hibernate.Session session=sessionFactory.openSession();
	org.hibernate.Query query=
			session.createQuery("from org.dxc.hibernate.model.Employee");
	java.util.List<org.dxc.hibernate.model.Employee>employee=
			query.list();
	
	System.out.println(employee);
	session.close();
	sessionFactory.close();
	return employees();
	
	
}
@Override
public org.dxc.hibernate.model.Employee getEmployeeById(long id){
	return null;
	
}

