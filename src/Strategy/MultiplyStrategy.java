package Strategy;

public class MultiplyStrategy implements Strategy {
    @Override
    public void execute(int a, int b) {
        System.out.println(a + " * " + b + " = " + (a * b));
    }
}
