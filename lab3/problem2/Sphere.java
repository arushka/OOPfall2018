public class Sphere extends Dshapes {


	public double radius;
	public double height;

	public Sphere(double radius, double height){
			this.radius = radius;
			this.height = height;
	}

	public double Volume(){
		return (4.0/3.0) * pi * this.radius * this.radius * this.radius ;
	}
	public double SurfaceArea(){
		return 4.0 * pi * this.radius * this.radius;
	}
	
	
}