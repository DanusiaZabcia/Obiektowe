package Zadanie7;

public class Firma {

	public static void main(String[] args) {

		Pracownik szaraczek = new Pracownik();
		System.out
				.println("imie " + szaraczek.imie + " nazwisko " + szaraczek.nazwisko + " pensja " + szaraczek.pensja);

		Pracownik szaraczek2 = new Pracownik("Kornel", "Testowy", 2500);
		System.out.println(
				"imie " + szaraczek2.imie + " nazwisko " + szaraczek2.nazwisko + " pensja " + szaraczek2.pensja);

		Szef prezes = new Szef();
		System.out.println("imie " + prezes.imie + " nazwisko " + prezes.nazwisko + " pensja " + prezes.pensja
				+ " premia " + prezes.premia);
		Szef prezes2 = new Szef( );
		prezes2.imie="John";
		prezes2.nazwisko="Moriarty";
		prezes2.pensja=7000;
		prezes2.premia=3000;
		
		System.out.println("imie " + prezes2.imie + " nazwisko " + prezes2.nazwisko + " pensja " + prezes2.pensja
				+ " premia " + prezes2.premia);
	}

}
