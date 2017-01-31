package Zadania6;

public class Employee {

	String name;
	String surname;
	int age;
	
	public Employee(){
		
		name= "empty";
		surname="empty";
		age = -1;
		
	};
	
	public Employee(String a, String b, int c){
	name=a;
	surname=b;
	age=c;
	
	}
	
	public Employee(Employee one){
		name= one.name;
		surname = one.surname;
		age= one.age;
	}
	
}
