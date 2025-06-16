class square{//custom class
    float side;
    public float area(){//method
        return 22*side*side/7;
    }
    public float perimeter(){//method
        return 44*side/7;
    }
}
public class oops_method{
    public static void main(String[] args){//main method
        square sq=new square();//Instantiation of a new square object
        sq.side=4;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}
