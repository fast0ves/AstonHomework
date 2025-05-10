package Adapter;

public class Adapter implements Target {
    private final Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        if (adaptee == null) {
            throw new IllegalArgumentException("Adaptee не может быть null");
        }
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
