package Mobile;

public class IosPhone extends Phone {

    @Override
    public void call(String target) {
        System.out.print("[IOS]");
        super.call(target);
    }

    public IosPhone() {
    }

    public IosPhone(String name, String version) {
        super(name, version);
    }
}
