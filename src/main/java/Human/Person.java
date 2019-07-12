package Human;

import Mobile.Phone;

import java.util.ArrayList;
import java.util.List;

public class Person {
    protected final String name;
    protected double weight;
    protected double heartRate;
    protected List<Phone> phones;

    public void eat(String food) {
        this.weight += 1;
        System.out.println(String.format("eating, and now weight is %f", weight));
    }

    public void introduce() {
        heartRate += 30;
        System.out.println(String.format("introducing, and heart rate is %f", heartRate));
    }


    public void sendMessage(String target, String message) {
        for (Phone phone : phones) {
            phone.sendMessage(message,target);
        }
    }

    public void call(String target) {
        for (Phone phone : phones) {
            phone.call(target);
        }
    }

    public Person(String name) {
        this.name = name;
        phones = new ArrayList<>();
    }

    public Person(String name, double weight, double heartRate) {
        this.name = name;
        this.weight = weight;
        this.heartRate = heartRate;
        phones = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public void buyPhone(Phone phone) {
        phones.add(phone);
    }
}
