public class Cube extends Dshapes implements DshapesInterf{
	public double side;

	public Cube(double side){
		this.side = side;
	}


	public double area(){
		return this.side * this.side;
	}


	public double volume(){
		return area() * this.side;
	}
}