class Person{
	public String name;
	public String address;
	public int age;
}

class Student extends Person{
	public int marks;
	public int rollNo;
	
	public void printDetails(){
		System.out.println(name);
		System.out.println(address);
		System.out.println(age);
		System.out.println(marks);
		System.out.println(rollNo);

}

public class Inheritance{
	public static void main(String[] args){
		Student s =new Student();
		s.printDetails();
	}
}