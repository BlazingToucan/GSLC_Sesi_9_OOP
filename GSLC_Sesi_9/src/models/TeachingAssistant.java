package models;

import java.util.Date;

import util.EarlyLeave;

public class TeachingAssistant extends Employee implements EarlyLeave{

	//key performance index
	private double KPI;

	public TeachingAssistant(String name, String address, String phone, String email, String position, String office,
			String shift, int salary, Date recruitedDate) {
		super(name, address, phone, email, position, office, shift, salary, recruitedDate);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void printData() {
		System.out.println("Name: "+name+" Phone: "+this.phone +" Office: "+this.office + " Shift: "+this.shift);
	}

	public double getKPI() {
		return KPI;
	}

	public void setKPI(double KPI) {
		this.KPI = KPI;
	}

	@Override
	public void twoHoursLeave() {
		System.out.println("This teaching assistant is using 2 hours early leave");
	}

	@Override
	public void fourHoursLeave() {
		System.out.println("This teaching assistant is using 4 hours early leave");
	}
	
}
