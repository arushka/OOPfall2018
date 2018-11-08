public class Chicken extends Mamal implements ColdBlooded{

	public Chicken(double size, double mass){
		super(size, mass);
	}

	
	public String SwimInColdWater(){
		return "i can swim in water with temp " + minTemp;
	}
}