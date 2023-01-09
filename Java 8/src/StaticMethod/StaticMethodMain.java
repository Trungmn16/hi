package src.StaticMethod;

class Car implements Vehicle {

    @Override
    public void showLog() {

    }
    void abc(){
        print();
        Vehicle.isValid();
    }
}


public class StaticMethodMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.abc();

    }
}
