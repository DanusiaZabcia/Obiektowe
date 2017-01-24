package Zadanie3;

public class Npunkt {

	int a;
	int b;

	void powiekszA() {
		a++;
	}

	void powiekszB() {
		b++;
	}

	void dodajA(int liczba) {
		a += liczba;

	}

	void dodajB(int liczba) {
		b += liczba;
	}

	int zwracaA() {

		return a;
	}

	int zwracaB() {
		return b;
	}
 
	void pokarz(){
		
		System.out.println("Wartoœæ A i B to "+ a + " "+b);
	}
	
}
