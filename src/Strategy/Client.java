package Strategy;

public class Client {
    public static void main(String[] args) {
        Context context = new Context(new AddStrategy());

        context.executeStrategy(5, 3);

        context.setStrategy(new SubtractStrategy());
        context.executeStrategy(5, 3);

        context.setStrategy(new MultiplyStrategy());
        context.executeStrategy(5, 3);
    }
}
