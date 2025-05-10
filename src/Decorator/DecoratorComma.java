package Decorator;

class DecoratorComma extends Decorator {
    public DecoratorComma(InterfaceComponent interfaceComponent) {
        super(interfaceComponent);
    }

    @Override
    public void doOperation() {
        System.out.print(",");
        super.doOperation();
    }

    @Override
    public void newOperation() {
        System.out.println("New comma operation");
    }
}