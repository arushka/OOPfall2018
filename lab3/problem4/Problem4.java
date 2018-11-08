
public class Problem4{
    public static void main(String[] args){
        StudentSample s = new StudentSample("Bolat","Aldiyar",2,"17B9910463");
        EmployeeSample e = new EmployeeSample("Kete","Lela",25000,"nkjdf388");
        PersonSample p1 = s;
        PersonSample p2 = e;
        System.out.println(p1.getName()+" "+ p1.getSurname());
        System.out.println(p2.getName()+" "+ p2.getSurname());
    }
}