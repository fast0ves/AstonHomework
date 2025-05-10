package Adapter;

public class AdapterDemo {
    public static void main(String[] args) {

        Adaptee adaptee = new Adaptee();

        Target adapter = new Adapter(adaptee);


        adapter.request();
    }
}
