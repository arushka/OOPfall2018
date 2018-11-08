public class Cylinder extends Dshapes implements DshapesInterf{

	public double radius;
	public double height;

	public Cylinder(double radius, double height){
		this.radius = radius;
		this.height = height;
	}

	public double area(){
		return this.radius * this.radius * DshapesInterf.pi;
	}


	public double volume(){
		return area() * height;
	}


}