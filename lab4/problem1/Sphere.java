public class Sphere extends Dshapes implements DshapesInterf{
	public double radius;
	public Sphere(double radius){
		this.radius = radius;
	}

	public double area(){
		return this.radius * this.radius * DshapesInterf.pi * 4;
	}


	public double volume(){
		return area() * (this.radius / 3.0);
	}
}