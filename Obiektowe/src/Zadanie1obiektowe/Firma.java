package Zadanie1obiektowe;
import java.util.Scanner;

public class Firma {

	public static void main(String[] args) {
	
		int x;
		Scanner odczyt = new Scanner(System.in);
		System.out.println("Proszê podaæ ilu pracownikow chcesz wprowadziæ");
		x = odczyt.nextInt();
		int y = x;
		odczyt.nextLine();
		Pracownik[] pracownik = new Pracownik[x];
		
		while (x>0){
			x--;
		pracownik[x] = new Pracownik();
		System.out.println("Podaj imiê");
		pracownik[x].imie = odczyt.nextLine();
		odczyt.nextLine();
		
		System.out.println("Podaj nazwisko");
		pracownik[x].nazwisko = odczyt.nextLine();
		odczyt.nextLine();
		
		System.out.println("Podaj wiek");
		pracownik[x].wiek = odczyt.nextInt();
		odczyt.nextLine();
		
		

		}
		odczyt.close();
		
		while(y>0){
			y--;
			System.out.println("Twój pracownik numer " + y + " to " + pracownik[y].imie +" , " + pracownik[y].nazwisko + " a jego wiek to " + pracownik[y].wiek );
		
		}
	}

}
