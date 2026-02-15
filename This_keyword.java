/*In Java, ‘this’ is a reference variable that refers to the current object, or can be said “this” in Java is a keyword that refers to the current object instance.
It can be used to call current class methods and fields, to pass an instance of the current class as a parameter, and to differentiate between the local and instance variables. 
Using “this” reference can improve code readability and reduce naming conflicts.
Java Program to implement this reference*/
public class This_keyword {
	String name;
	int age;
    This_keyword(){ // used to invoke current class method and fields, to pass an instance{
		this("Unknown", 0); // calling parameterized constructor from default constructor
    }
	This_keyword(String n, int a){
		name = n;
		age = a;
	}
	public String get_name(This_keyword a){ 
		return a.name; 
	}
	public void change_name(String name, This_keyword a){
		a.name = name;
	}
	public void printDetails(This_keyword a){
		System.out.println("Name: " + a.name);
		System.out.println("Age: " + a.age);
		System.out.println();
	}
	public void show(This_keyword student){ // used to invoke current class method and fields, to pass an instance
		System.out.println("Showing student details:");
		student.printDetails(student);
	}
	public static void main(String[] args){
		This_keyword obj = new This_keyword();
		obj.show(obj);
		This_keyword first = new This_keyword("Soumya", 18);
		This_keyword second = new This_keyword("Surya", 22);
		first.show(first);
		second.show(second);
		first.change_name("Swastik", first);
		System.out.println("Name has been changed to: "+ first.get_name(first));
	}
}
// here the work of this keyword is done without using this keyword 