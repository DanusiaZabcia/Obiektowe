package Zadania6;

public class Company {

	public static void main(String[] args) {

		Employee[] first = new Employee[5];

		int n = 0;
		while (n < 5) {
			first[n] = new Employee();

			System.out.println(first[n].name + first[n].surname + first[n].age);
			n++;
		}

	}
}