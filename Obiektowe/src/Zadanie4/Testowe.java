package Zadanie4;

public class Testowe {
	
 public static void main(String args[]) {
Przeciaz obiekt= new Przeciaz();
 
System.out.println(obiekt.dajX(22,22));
System.out.println(obiekt.dajX(22.33,22.22));
System.out.println(obiekt.dajX(22l,22l));
System.out.println(obiekt.dajX(22f,22f));
System.out.println(obiekt.dajX((short )2, (short) 22));
 }
}
