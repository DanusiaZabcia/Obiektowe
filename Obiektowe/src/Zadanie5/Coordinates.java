package Zadanie5;

public class Coordinates {

	public static void main(String[] args) {
		
		Kon punkt1 = new Kon(10,30);
		System.out.println("wsp�rz�dne x to "+ punkt1.x+" wsp�rz�dne y to "+ punkt1.y);
		
		Kon punkt2 = new Kon(punkt1);
		System.out.println("wsp�rz�dne x to "+ punkt2.x+" wsp�rz�dne y to "+ punkt2.y);
	}

}
