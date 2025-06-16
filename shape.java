class circle{//custom class
    int areacircle;
    public void setAreaOfCircle(int a,int ar){//setter
        ar=44*a*a/7;
        this.areacircle=ar;
    }
    public int getAreaofcircle(){//getter
        return areacircle;
    }
}
class cylinder extends circle{//custom class
    int areacyl;
    public void setAreaofCylinder(int r,int arcyl,int h){//setter
        arcyl=44*r*h/7;
        this.areacyl=arcyl;
    }
    public int getAreaofCylinder(){//getter
        return areacyl;
    }
}
public class shape{//main class
    public static void main(String[]args){//main method
        circle cr=new circle();
        cr.setAreaOfCircle(8,5);
        System.out.println("Area of circle "+cr.getAreaofcircle());
        cylinder cyl=new cylinder();
        cyl.setAreaofCylinder(7, 9,12);
        System.out.println("Area of cylinder "+cyl.getAreaofCylinder());
    }
}
