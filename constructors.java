class MyMainEmployee{
private int id;
private String name;
public MyMainEmployee(String myName, int myId){
    this.name=myName;
    this.id=myId;
}
public String getName(){//getters (returns the value) (accessors)
    return name;//returns the value to the main method
}
public void setName(String n){//setters (sets or updates the value) (mutators)
    this.name = n;//n is a parameter
}
public void setId(int i){//setters
    this.id = i;//i is a parameter
}
public int getId(){//getters
    return id;//returns the value to the main method
}
}
public class constructors {
    public static void main(String[] args) {
        MyMainEmployee sc=new MyMainEmployee("Soumya", 78);
        //sc.setName("Soumya");
        //sc.setId(34);
        System.out.println(sc.getName());
        System.out.println(sc.getId());
    }
}