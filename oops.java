class Employee// custom class
{
    int id;
    int salary;
    String name;
    public void printDetails()
    {
        System.out.println("My Id is "+id);
        System.out.println("My name is "+name);
        System.out.println("My salary is "+salary);  
    }
    public int getSalary()
    {
        return salary;
    }
}
public class oops
{
    public static void main(String[]args)
    {
       System.out.println("Custom class");
       Employee sd=new Employee();// Instantiating a new employee object
       Employee rd=new Employee();
       sd.id=12;
       sd.salary=34;
       sd.name= "Soumya";
       rd.id=17;
       rd.salary=12;
       rd.name= "Reshmi";
       sd.printDetails();
       sd.getSalary();
       rd.printDetails(); 
       rd.getSalary();
    }
}