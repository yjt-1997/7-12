package Mobile;
public class Phone implements MyCallable{
    protected String name;
    protected String version;

    public void sendMessage(String message, String target) {
        System.out.println(String.format("send message:\"%s\" to %s", message, target));
    }

    public void call(String target) {
        System.out.println(String.format("call to %s", target));
    }

    public Phone() {
    }

    public Phone(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
