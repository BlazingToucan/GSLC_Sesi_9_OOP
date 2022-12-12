package models;

import java.util.Date;

abstract public class Employee extends Persona{
	protected String position;
	protected String office;
	protected String shift;
	protected int salary;
	protected Date recruitedDate;

	public Employee(String name, String address, String phone, String email, String position, String office,
			String shift, int salary, Date recruitedDate) {
		super(name, address, phone, email);
		this.position = position;
		this.office = office;
		this.shift = shift;
		this.salary = salary;
		this.recruitedDate = recruitedDate;
	}



	@Override
	abstract public void printData();
	
	

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Date getRecruitedDate() {
		return recruitedDate;
	}

	public void setRecruitedDate(Date recruitedDate) {
		this.recruitedDate = recruitedDate;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	
	
	
}
