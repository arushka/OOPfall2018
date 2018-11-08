public class Cylinder extends Dshapes{

	public double radius;
	public double height;




	public Cylinder(double radius, double height){
		this.radius = radius;
		this.height = height;
	}

	
	public double Volume(){
		return 2.0 * pi * radius * radius * height;
	}
	public double SurfaceArea(){
		return 2.0 * pi * radius * radius;
	}
	public double TopArea(){
		return pi * radius * radius;
	}


	
	
}