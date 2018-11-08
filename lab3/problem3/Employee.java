public class Employee extends Person{

	private double salary;
	private int year;
	private String insuranceNumber;

	public Employee(String name, double salary, int year, String insuranceNumber){
		super(name);
		this.salary = salary;
		this.year = year;
		this.insuranceNumber = insuranceNumber;
	}


	
	public double Getsalary(){
		return this.salary;
	}
	public void Setsalary(double salary){
		this.salary = salary;
	}
	public int Getyear(){
		return this.year;
	}
	public void Setyear(int year){
		this.year = year;
	}
	public String GetinsuranceNumber(){
		return this.insuranceNumber;
	}
	public void Setyear(String insuranceNumber){
		this.insuranceNumber = insuranceNumber;
	}


	public String toString(){
		return super.toString() + " salary: " + this.salary + " year: " + this.year + " insuranceNumber: " + this.insuranceNumber;
	}

	public boolean equals(String name, double salary, int year, String insuranceNumber){
		if(super.equals(name) && (this.salary == salary) && (this.year == year) && (this.insuranceNumber == insuranceNumber)) return true;
		else return false;
	}







}