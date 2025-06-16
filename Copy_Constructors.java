class Complex {
	private final double re, im;
	// Parameterized constructor
    public Complex(double re, double im){
		this.re = re;
		this.im = im;
	}
	// Copy constructor
	Complex(Complex c){
		System.out.println("Copy constructor called");
		re = c.re;
		im = c.im;
	}
	//Main Overriding the toString() of Object class
	@Override 
	public String toString(){
		return "(" + re + " + " + im + "i)";
	}
}
public class Copy_Constructors{
	public static void main(String[] args){
		Complex c1 = new Complex(10, 15);
		Complex c2 = new Complex(c1);
		// Note: Following doesn't involve a copy constructor call as non-primitive variables are just references.
		Complex c3 = c2;
		// toString() of c2 is called here
		System.out.println(c2);
		System.out.println(c3);
	}
}
