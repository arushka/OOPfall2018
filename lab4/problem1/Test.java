public class Test{
	public static void main(String[] args) {
		Cylinder cylinder = new Cylinder(3, 5);
		Sphere sphere = new Sphere(3);
		Cube cube = new Cube(4);
		Point point = new Point();

		System.out.println(cylinder.area());
		System.out.println(cylinder.volume());

		System.out.println(sphere.area());
		System.out.println(sphere.volume());

		System.out.println(cube.area());
		System.out.println(cube.volume());

		System.out.println(point.area());
		System.out.println(point.volume());



	}
}