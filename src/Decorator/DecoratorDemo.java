package Decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Decorator decorator = new DecoratorHello(
                                   new DecoratorComma(
                                      new DecoratorSpace(
                                         new MainComponent())));
        decorator.doOperation();
        decorator.newOperation();
    }
}
