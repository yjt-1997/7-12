package Human;

import Car.Car;
import Mobile.MyCallable;
import Mobile.Phone;

import java.util.ArrayList;
import java.util.List;

public class Driver extends Person implements MyCallable {

    private Car car;

    public void drive() {
        car.setSpeed(car.getSpeed() + 10);
        System.out.println(String.format("drving , and car's speed is %f", car.getSpeed()));
    }

    public void call(String target) {
        for (Phone phone : phones)
            phone.call(target);
    }

    public Driver(String name) {
        super(name);
        phones = new ArrayList<>();
    }

    public Driver(String name, double weight, double heartRate) {
        super(name, weight, heartRate);
        phones = new ArrayList<>();
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

}
