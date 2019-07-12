package Car;

public abstract class Car {
    protected double speed;
    protected String name;
    protected String color;

    public void accelerate() {
        this.speed += 30;
        System.out.println(String.format("accelerating 30, and now its speed is %.0f", this.speed));
    }

    public void accelerate(double speed) {
        this.speed += speed;
        System.out.println(String.format("accelerating %f, and now its speed is %.0f", speed, this.speed));
    }

    public void decelerate() {
        this.speed -= 50;
        System.out.println(String.format("decelerating 50, and now its speed is %.0f", this.speed));
    }

    public void decelerate(double speed) {
        this.speed -= speed;
        System.out.println(String.format("decelerating %f, and now its speed is %.0f", speed, this.speed));
    }

    public void skid(){
        this.speed = 0;
        System.out.println(String.format("skiding, now its speed is %.0f",speed));
    }

    public abstract  void run();

    public Car() {
    }

    public Car(double speed, String name, String color) {
        this.speed = speed;
        this.name = name;
        this.color = color;
    }

    public double getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
