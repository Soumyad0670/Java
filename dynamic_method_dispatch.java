class phone {// super class
    public void on() {
        System.out.println("Turning on phone");
    }

    public void showTime() {
        System.out.println("Time is 12 pm");
    }

    public void music() {
        System.out.println("Playing Music");
    }
}

class smartPhone extends phone {// sub class
    @Override
    public void on() {// overridden method { method present in both subclass and super class }
        System.out.println("Turning on smartPhone");
    }

    @Override
    public void music() {// overridden method { method present in both subclass and super class }
        System.out.println("Playing DJ Music");
    }

    public void gaming() {// method of subclass
        System.out.println("playing games");
    }
}

public class dynamic_method_dispatch {// Run time polymorphism in Java
    public static void main(String[] args) {// main method
        phone obj = new phone();// creation of object of super class
        obj.on();// calling method from super class phone
        obj.music();
        obj.showTime();
        phone smobj = new smartPhone();// phone(super class)-reference and smartPhone(subclass)-object
        /*
         * Super ob=new Sub();--->allowed
         * smartPhone smobj =new phone();--->Not Allowed
         * Sub ob=new Super();--->not allowed
         * smobj.gaming();-->not allowed
         * methods can be called from smobj if the methods are from super class and only
         * if the methods are overridden,not from subclass
         */
        smobj.music();// calling overridden method
        smobj.on();// calling overridden method
        smobj.showTime();// calling method from super class
        smartPhone sm = new smartPhone();// creation of object of sub class
        sm.gaming();// gaming present in sub class therefore refernce should also be from sub class for gaming() method invocation
    }
}