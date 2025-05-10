package Strategy;

public class SubtractStrategy implements Strategy {

    @Override
    public void execute(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }
}
