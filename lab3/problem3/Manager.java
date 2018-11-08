public class Manager extends Employee{

	private String team;



	public Manager(String name, double salary, int year, String insuranceNumber, String team){
		super(name, salary,  year,  insuranceNumber);
		this.team = team;
	}

	public String Getteam(){
		return this.team;
	}
	public void Setteam(String team){
		this.team = team;
	}

	public void Getbonus(double bonus){
		super.Setsalary( super.Getsalary() + bonus );
	}

	public String toString(){
		return super.toString() + " manager of a team " + team;
	}

	public boolean equals(String name, double salary, int year, String insuranceNumber, String team){
		if(super.equals(name, salary, year, insuranceNumber) && (this.team == team)) return true;
		else return false;
	}



}