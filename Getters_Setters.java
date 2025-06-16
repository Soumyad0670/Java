class MyEmployee {// custom class
    private int id;// private access modifier can be accessed through methods and data hiding is
                   // implemented
    private String name;// private access modifier

    public String getName() {// getters (returns the value) (accessors)
        return name;// returns the value to the main method
    }

    public void setName(String n) {// setters (sets or updates the value) (mutators)
        this.name = n;// n is a parameter
    }

    public void setId(int i) {// setters
        this.id = i;// i is a parameter
    }

    public int getId() {// getters
        return id;// returns the value to the main method
    }
}

public class Getters_Setters {// class name
    public static void main(String[] args) {// main method
        MyEmployee me = new MyEmployee();// Instantiation of a MyEmployee object
        // me.id=45;
        // me.name="Soumya";---->throws an error due to private access modifer
        me.setName("Soumya");// calling the method {Soumya acting as an argument}
        System.out.println("The name of employee is " + me.getName());
        me.setId(23);// calling the method {23 acting as an argument }
        System.out.println("The id of employee is " + me.getId());
    }
}