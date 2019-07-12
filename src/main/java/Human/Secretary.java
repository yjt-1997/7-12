package Human;

import Human.Person;
import Mobile.MyCallable;
import Mobile.Phone;

public class Secretary extends Person implements MyCallable {

    @Override
    public void call(String target) {
        for (Phone phone : phones)
            phone.call(target);
    }

    public Secretary(String name) {
        super(name);
    }

    public Secretary(String name, double weight, double heartRate) {
        super(name, weight, heartRate);
    }
}
