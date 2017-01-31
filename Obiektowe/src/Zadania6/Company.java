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
Employee[] second = new Employee[3];

second[0]= new Employee("Sherlock", "Holmes", 28);
second[1]= new Employee("John", "Watson", 30);
second[2]= new Employee(second[0]);

for(int i =0; i<3;i++){
	System.out.println(second[i].name + second[i].surname + second[i].age);
}
	}
}