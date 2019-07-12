import Human.Boss;
import Human.Driver;
import Human.Secretary;
import Mobile.AndroidPhone;
import Mobile.IosPhone;

public class Test {
    public static void main(String[] args) {
//        Driver jimmy = new Driver("Jimmy", 70, 60);
//        jimmy.buyPhone(new AndroidPhone("XiaoMi", "9"));
//        jimmy.buyPhone(new IosPhone("iPhone", "XSM"));
//        jimmy.setCar(new JeepCar(50, "Jeep", "red"));
//        jimmy.sendMessage("18195857647","i buyed two phones!");
//        jimmy.call("18195857647");
//        jimmy.setCar(new RaceCar(100,"ReacCar","red"));
//        ((RaceCar)jimmy.getCar()).drift();
//        ((RaceCar)jimmy.getCar()).drift();
//        ((RaceCar)jimmy.getCar()).drift();
//        jimmy.getCar().skid();
        Boss mophy = new Boss("mophy", 70, 60);
        Driver driver = new Driver("driver1", 80, 60);
        driver.buyPhone(new AndroidPhone("Xiaomi", "9"));
        Secretary secretary = new Secretary("secretary1", 50, 60);
        secretary.buyPhone(new AndroidPhone("honor", "play"));
        mophy.setCallable(driver);
        mophy.call("18193849494");
        mophy.setCallable(secretary);
        mophy.call("18193844639");
        mophy.buyPhone(new IosPhone("iPhone", "XMS"));
        mophy.call("18164922932");
    }
}
