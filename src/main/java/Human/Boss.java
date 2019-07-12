package Human;

import Mobile.MyCallable;

import java.util.concurrent.Callable;

public class Boss extends Person {

    private MyCallable callable;

    public void setCallable(MyCallable callable) {
        this.callable = callable;
    }

    public void call(String target) {
        callable.call(target);
    }

    public Boss(String name, double weight, double heartRate) {
        super(name, weight, heartRate);
    }
}
