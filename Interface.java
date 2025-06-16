interface Bicycle {

    public static int getA() {
        return a;
    }
    int a = 45;// all properties in interfaces are final

    void applyBrake(int dec);

    void speedUp(int inc);

    private void run() {// private method can be created inside an interface
        System.out.println("Running");
    }

    default void jog() {// default method can be created inside an interface
        run();// calling the private method run
    }

    static void sprinting() {// static method can be created inside an interface
        System.out.println("Marathon");
    }
}

interface HornBicycle {// all the methods in an interface are public and abstract by default
    void Fuel();

    void Petrol();
}
/*
 * we cannot extend multiple abstract classes but multiple interfaces can be
 * implemented at the same time
 * interface MarutiSuzuki extends HornBicycle{}---->allowed
 * interface MarutiSuzuki implements HornBicycle{}---->not allowed
 * class cannot implement another class it should be extended
 * interfaces are meant for dynamic method dispatch and run time polymorphism
 */
abstract class Tata {
    public void Cars() {
        System.out.println("Merecedes");
    }

    @SuppressWarnings("unused")
    abstract void Bus();
}

@SuppressWarnings("unused")
abstract class HondaCity {
    public void LuxuriousCars() {
        System.out.println("Transport");
    }
}

class AvonCycle extends Tata implements Bicycle, HornBicycle {
    @SuppressWarnings("unused")
    void blowHorn() {
        System.out.println();
    }

    @Override
    public void applyBrake(int dec) {
        System.out.println("Applying break");
    }

    @Override
    public void speedUp(int inc) {
        System.out.println("Applying speed up");
    }

    @Override
    public void Fuel() {
        System.out.println("Low fuel");
    }

    @Override
    public void Petrol() {
        System.out.println("Low Petrol");
    }

    @Override
    public void Cars() {
        System.out.println("Lamborgini");
    }

    @Override
    public void Bus() {
        System.out.println("227");
    }
}

public class Interface {// group of methods
    public static void main(String[] args) {// main method
        AvonCycle cycle = new AvonCycle();
        Tata cycle2 = new AvonCycle();
        cycle2.Cars();
        cycle.applyBrake(4);
        @SuppressWarnings("static-access")
        int b = cycle.a;
        System.out.println(b);
    }
}
