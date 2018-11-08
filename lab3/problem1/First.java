public class First{
	public static void main(String args[]){
		Dog d = new Dog(89, "black", "Choppi");

		System.out.println(d.GetName());
		System.out.println(d.SumOfAllLegs(1, 3, 4, 5));
		System.out.println(d.SumOfAllLegs(1, 3, 4));

	}
}