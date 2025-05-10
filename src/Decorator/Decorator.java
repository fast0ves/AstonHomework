package Decorator;

public class Decorator implements InterfaceComponent {
    private InterfaceComponent component;

    public Decorator(InterfaceComponent interfaceComponent) {
        component = interfaceComponent;
    }

    @Override
    public void doOperation() {
        component.doOperation();
    }

    public void newOperation() {
        System.out.println("Do nothing");
    }
}
