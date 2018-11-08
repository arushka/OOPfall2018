public class Mamal extends Animal implements Swim, Run {
	public Mamal(double size, double mass){
		super(size, mass);
	}

	


	public String Voice(){
		return ("i am the mamal ");
	}

	public String saySwim(){
		return "i am swimming";
	}

	public double getRunspeed(){
		return Run.speed;
	}

}//1