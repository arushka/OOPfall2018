public class Dog extends Animal{

	public String name;


	public Dog(int size, String colour, String name){
		super(size, colour);
		this.name = name;
	}
	public Dog( String name){
		super();
		this.name = name;
	}



	public String GetName(){
		return   this.name;
	}


	public int  SumOfAllLegs(int lFirstLeg, int lSecondLeg, int lThirdLeg, int lFourthLeg){
		return lFirstLeg + lSecondLeg + lThirdLeg + lFourthLeg;
	}

	public int  SumOfAllLegs(int lFirstLeg, int lSecondLeg, int lThirdLeg){
			return lFirstLeg + lSecondLeg + lThirdLeg ;
		}


}