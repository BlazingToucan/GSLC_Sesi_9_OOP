package models;

import java.util.Date;

public class Staff extends Employee{


	public Staff(String name, String address, String phone, String email, String position, String office, String shift,
			int salary, Date recruitedDate) {
		super(name, address, phone, email, position, office, shift, salary, recruitedDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printData() {
		System.out.println("Name: "+name+" Phone: "+this.phone +" Office: "+this.office + " Shift: "+this.shift);
	}
	
}
