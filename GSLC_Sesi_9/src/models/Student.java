package models;

public class Student extends Persona{
	
	protected final String status;//active atau non-active(cuti)
	protected double GPA;

	public Student(String name, String address, String phone, String email, String status) {
		super(name, address, phone, email);
		this.status=status;
	}


	@Override
	public void printData() {
		System.out.println("Name: "+name+" GPA: "+this.GPA +" Status: "+this.status );
	}


	public double getGPA() {
		return GPA;
	}


	public void setGPA(double GPA) {
		this.GPA = GPA;
	}


	public String getStatus() {
		return status;
	}

}
