package Builder;

class Client {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreteBuilder();

        Product product = director.construct(builder);
        product.show();
    }
}
