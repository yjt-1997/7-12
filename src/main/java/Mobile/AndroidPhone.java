package Mobile;


public class AndroidPhone extends Phone{
    @Override
    public void sendMessage(String message, String target) {
        System.out.print("[Android]");
        super.sendMessage(message, target);
    }

    public AndroidPhone() {
    }

    public AndroidPhone(String name, String version) {
        super(name, version);
    }
}
