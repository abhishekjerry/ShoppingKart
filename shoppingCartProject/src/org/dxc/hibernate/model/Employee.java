package org.dxc.hibernate.model;

@javax.persistence.Entity
@javax.persistence.Table(name="Employee")


public class Employee {
	@javax.persistence.Id
	@javax.persistence.Column(name="ID")
	private int id;
	
	@javax.persistence.Column(name="NAME")
	private String name;
	
	@javax.persistence.Column(name="JOINING")
	private java.sql.Date joining;
	
	@javax.persistence.Column(name="SALARY")
	private double salary;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public java.sql.Date getJoining() {
		return joining;
	}

	public void setJoining(java.sql.Date joining) {
		this.joining = joining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", joining=" + joining
				+ ", salary=" + salary + "]";
	}

	
}
