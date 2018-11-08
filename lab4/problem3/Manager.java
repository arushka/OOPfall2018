import java.util.Date;

public class Manager extends Employee implements Comparable, Cloneable{

	private String team;
	private double bonus;



	public Manager(String name, double salary, Date hireDate, String insuranceNumber, String team){
		super(name, salary,  hireDate,  insuranceNumber);
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
		this.bonus = bonus;
	}

	public void Setbonus(double bonus){
		this.bonus = bonus;
	}

	public String toString(){
		return super.toString() + " manager of a team " + team;
	}

	public boolean equals(String name, double salary, Date hireDate, String insuranceNumber, String team){
		if(super.equals(name, salary, hireDate, insuranceNumber) && (this.team == team)) return true;
		else return false;
	}

	public int CompareManager(Manager m){
		if(this.salary > m.salary) return 1;
		else if(this.salary < m.salary) return 2;
		else{
			if(this.bonus > m.bonus) return 1;
			else if(this.bonus < m.bonus) return 2;
			else return 0;
		}
	}

	/*public Manager clone() {
		 try {
      		return (Manager)super.clone();
    	}catch(CloneNotSupportedException ex) {
      		throw new InternalError();
    	}
	}*/

}