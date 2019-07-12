package Car;

import Car.Car;

public class JeepCar extends Car {

    public void jump() {
        this.speed -= 10;
        System.out.println(String.format("jumping,and its speed is %.0f", speed));
    }

    public void run(){
        accelerate();
        accelerate();
        jump();
    }

    public JeepCar() {
    }

    public JeepCar(double speed, String name, String color) {
        super(speed, name, color);
    }
}
