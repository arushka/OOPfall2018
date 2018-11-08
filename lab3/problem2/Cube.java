public class Cube extends Dshapes{

	public double side;

	public Cube(double side){
		this.side = side;
	}

	public double Volume(){
		return side * side * side;
	}
	public double SurfaceArea(){
		return side * side * 6;
	}
	
	public double TopArea(){
		return side * side;
	}
}