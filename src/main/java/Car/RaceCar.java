package Car;

import Car.Car;

public class RaceCar extends Car {
    public void drift(){
        this.speed -= 30;
        System.out.println(String.format("drifting,and its speed is %.0f", speed));
    }

    public void run(){
        accelerate();
        accelerate();
        accelerate();
        accelerate();
        accelerate();
        drift();
        drift();
    }
    public RaceCar() {
    }

    public RaceCar(double speed, String name, String color) {
        super(speed, name, color);
    }
}
