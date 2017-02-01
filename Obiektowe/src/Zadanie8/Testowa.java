package Zadanie8;

public class Testowa {

	public static void main(String[] args) {

		Point2D one = new Point2D();

		System.out.println("Wspó³rzêdne punkt 1 x " + one.x + " y " + one.y);

		Point2D two = new Point2D(23, 33);
		System.out.println("Wspó³rzêdne punkt 2 : x " + two.x + " y " + two.y);

		Point3D third = new Point3D();
		System.out.println("Wspó³rzêdne punkt 3: x " + third.x + " y " + third.y + " z " + third.z);

		Point3D fourth = new Point3D();
		fourth.x = 45;
		fourth.y = 12;
		fourth.z = 54;
		System.out.println("Wspó³rzêdne punkt 4: x " + fourth.x + " y " + fourth.y + " z " + fourth.z);
	}

}
