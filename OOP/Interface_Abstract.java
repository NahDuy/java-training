// hành vi trừu tượng
//modifier public abstract
//public static final
interface Vehicle {
    void start();
}

// hành vi trừu tượng + hành vi sẵn có
abstract class Car {
    abstract void drive();

    void refuel() {
        System.out.println("Refueling the car...");
    }
}

class Sedan extends Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Starting the Sedan...");
    }

    @Override
    void drive() {
        System.out.println("Driving the Sedan on the road...");
    }
}

public class Interface_Abstract {
    public static void main(String[] args) {
        Sedan sedan = new Sedan();
        sedan.start();   
        sedan.drive();   
        sedan.refuel(); 
    }
}
//Abstract class implement interface thì không cần overide