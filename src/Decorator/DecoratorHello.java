package Decorator;

class DecoratorHello extends Decorator {
    public DecoratorHello(InterfaceComponent interfaceComponent) {
        super(interfaceComponent);
    }

    @Override
    public void doOperation() {
        System.out.print("Hello");
        super.doOperation();
    }

    @Override
    public void newOperation() {
        System.out.println("New hello operation");
    }
}