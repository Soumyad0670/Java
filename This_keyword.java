/*In Java, ‘this’ is a reference variable that refers to the current object, or can be said “this” in Java is a keyword that refers to the current object instance.
It can be used to call current class methods and fields, to pass an instance of the current class as a parameter, and to differentiate between the local and instance variables. 
Using “this” reference can improve code readability and reduce naming conflicts.
Java Program to implement this reference*/
public class This_keyword {
	String name;
	int age;
	This_keyword(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String get_name(){ 
		return name; 
	}
	public void change_name(String name){
		this.name = name;
	}
	public void printDetails(){
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println();
	}
	public static void main(String[] args){
		This_keyword first = new This_keyword("Soumya", 18);
		This_keyword second = new This_keyword("Surya", 22);
		first.printDetails();
		second.printDetails();
		first.change_name("Swastik");
		System.out.println("Name has been changed to: "+ first.get_name());
	}
}