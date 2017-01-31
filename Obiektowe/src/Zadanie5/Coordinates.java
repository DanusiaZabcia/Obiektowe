package Zadanie5;

public class Coordinates {

	public static void main(String[] args) {
		
		Kon punkt1 = new Kon(10,30);
		System.out.println("wspó³rzêdne x to "+ punkt1.x+" wspó³rzêdne y to "+ punkt1.y);
		
		Kon punkt2 = new Kon(punkt1);
		System.out.println("wspó³rzêdne x to "+ punkt2.x+" wspó³rzêdne y to "+ punkt2.y);
	}

}
