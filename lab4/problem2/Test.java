public class Test{
	public static void main(String[] args) {
		Mamal mamal = new Mamal(4, 5);

		System.out.println(mamal.Voice());
		System.out.println(mamal.saySwim());
		System.out.println(mamal.getRunspeed());

		System.out.println("---------------------------");

		Konie k = new Konie(45);
		if(k.NORazdvoenieLichnosty()) System.out.println("yes ");
		System.out.println("---------------------------");

		Girl girl = new Girl("Sabina", true);
		System.out.println(girl.toString());
		System.out.println("---------------------------");

		Chicken chicken = new Chicken(7.0, 5.0);
		System.out.println(chicken.SwimInColdWater());








	}
}


// 1 multiple inheritance
// 2 size
// 3 A is B
// 4 A has B 
// 5 no clear line of inheritance 