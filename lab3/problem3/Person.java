abstract class Person{


	private String name;


	public Person(String name){
		this.name = name;
	}

	public String Getname(){
		return this.name;
	}
	public void Setname(String name){
		this.name = name;
	}




	public boolean equals(String name){
		if(this.name == name) return true;
		else return false;
	}

	public String toString(){
		return " name: " + this.name;
	}

}