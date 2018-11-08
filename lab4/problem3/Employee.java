import java.util.Date;
public class Employee extends Person implements Comparable, Cloneable{

	public double salary;
	private Date hireDate; // Date of starting work
	private String insuranceNumber;



	public Employee(String name, double salary, Date hireDate, String insuranceNumber){
		super(name);
		this.salary = salary;
		this.hireDate = (hireDate);
		this.insuranceNumber = insuranceNumber;
	}
	

	public double Getsalary(){
		return this.salary;
	}
	public void Setsalary(double salary){
		this.salary = salary;
	}
	public Date GetDate(){
		return this.hireDate;
	}
	public void Setyear(Date hireDate){
		this.hireDate = hireDate;
	}
	public String GetinsuranceNumber(){
		return this.insuranceNumber;
	}
	public void Setyear(String insuranceNumber){
		this.insuranceNumber = insuranceNumber;
	}


	public String toString(){
		return super.toString() + " salary: " + this.salary + " date: " + this.hireDate + " insuranceNumber: " + this.insuranceNumber;
	}

	public boolean equals(String name, double salary, Date hireDate, String insuranceNumber){
		if(super.equals(name) && (this.salary == salary) && (this.hireDate.equals(hireDate)) && (this.insuranceNumber == insuranceNumber)) return true;
		else return false;
	}


	public int CompareEmployee(Employee e){
		if(this.salary > e.salary) return 1;
		else if(this.salary < e.salary) return 2;
		return 0;
	}


    public Employee clone() throws CloneNotSupportedException {
       		Employee cloned = new Employee(Getname(), this.salary, this.hireDate, this.insuranceNumber);
        	cloned.hireDate = (Date)hireDate.clone();
        	return cloned;
    }




}