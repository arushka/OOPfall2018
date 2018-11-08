public class Girl {

	public String name;
	public boolean haveHorse;
	public Horse pet; // member field 

	public Girl(String name, boolean haveHorse){
		this.name = name;
		if(haveHorse){
			this.haveHorse = true;
		}else{
			this.haveHorse = false;
		}
	}


	public String toString(){
		String s = this.name;
		if(this.haveHorse){
			s += " have horse" + " with size " + pet.size;
		}else{
			s += " havn't horse";
		}
		return s;
	}

}////4 