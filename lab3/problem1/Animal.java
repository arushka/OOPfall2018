abstract class Animal{
	public int size;
	public String colour;
	

	public Animal(int size, String colour){
		this.size = size;
		this.colour = colour;
	}
	

	public Animal(){} ;

	public int GetSize(){
		return this.size;
	}

	public String GetName(){
		return "";
	}
}