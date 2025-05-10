package Builder;

public class Director {
    public Product construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
