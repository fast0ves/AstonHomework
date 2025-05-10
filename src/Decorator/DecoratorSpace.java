package Decorator;

public class DecoratorSpace extends Decorator {
    public DecoratorSpace(InterfaceComponent interfaceComponent) {
        super(interfaceComponent);
    }

    @Override
    public void doOperation() {
        System.out.println(" ");
        super.doOperation();
    }

    @Override
    public void newOperation() {
        System.out.println("New space operation");
    }
}
