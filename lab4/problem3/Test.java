import java.util.Date;
import java.util.Calendar;

public class Test{

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 1989);
		cal.set(Calendar.MONTH, Calendar.JANUARY);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		Date dateRepresentation = cal.getTime();
		Employee emp = new Employee("alex", 5454454.4545, dateRepresentation, "BD3832");


		
		 System.out.println(emp.Getname());
		 emp.Setname("bob");
		 System.out.println(emp.Getname());
		 System.out.println(emp.toString());



		 System.out.println(emp.toString());
		 if(emp.equals("bosb", 5454454.4545, dateRepresentation, "BD3832")) System.out.println(emp.toString());


		 System.out.println("------------------");




		Calendar calman = Calendar.getInstance();
		calman.set(Calendar.YEAR, 1999);
		calman.set(Calendar.MONTH, Calendar.JANUARY);
		calman.set(Calendar.DAY_OF_MONTH, 9);
		Date dateRepresentationman = calman.getTime();
		 Manager man = new Manager("hiposs", 690000.0, dateRepresentationman, "BD20832", "redTeam");
		 System.out.println(man.Getteam());
		 man.Getbonus(30000);
		 System.out.println(man.Getsalary());
		 System.out.println(man.toString());

		 //////

		System.out.println("---------HERE STARTS LAB 4----");
		Calendar cal2 = Calendar.getInstance();
		cal2.set(Calendar.YEAR, 1989);
		cal2.set(Calendar.MONTH, Calendar.JANUARY);
		cal2.set(Calendar.DAY_OF_MONTH, 1);
		Date dateRepresentation2 = cal2.getTime();
		Employee emp2 = new Employee("alex", 5454454.4545, dateRepresentation2, "BD3832");

		System.out.println(emp.CompareEmployee(emp2));

		System.out.println("--------- FOR MANAGER ----");

		Calendar calman2 = Calendar.getInstance();
		calman2.set(Calendar.YEAR, 1999);
		calman2.set(Calendar.MONTH, Calendar.JANUARY);
		calman2.set(Calendar.DAY_OF_MONTH, 9);
		Date dateRepresentationman2 = calman2.getTime();
		Manager man2 = new Manager("hiposs", 690000.0, dateRepresentationman2, "BD20832", "redTeam");
		man2.Getbonus(30010);

		System.out.println(man2.CompareManager(man));

		System.out.println("--------- CLONABLE ----");


		try{
			Employee empCloned = (Employee)emp.clone();
			System.out.println(empCloned.Getname());
		}catch(CloneNotSupportedException ex){
            System.out.println("Error");
        }
		











	}

}