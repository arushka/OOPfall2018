public class First{

	public static void main(String[] args) {
		 Employee emp = new Employee("alex", 5454454.4545, 1998, "BD3832");


		
		 System.out.println(emp.Getname());
		 emp.Setname("bob");
		 System.out.println(emp.Getname());
		 System.out.println(emp.toString());



		 System.out.println(emp.toString());
		 if(emp.equals("bosb", 5454454.4545, 1998, "BD3832")) System.out.println(emp.toString());


		 System.out.println("------------------");

		 Manager man = new Manager("hiposs", 690000.0, 1995, "BD20832", "redTeam");
		 System.out.println(man.Getteam());
		 man.Getbonus(30000);
		 System.out.println(man.Getsalary());
		 System.out.println(man.toString());



	}

}