package ChainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        Handler firstHandler = new FirstHandler();
        Handler secondHandler = new SecondHandler();
        Handler thirdHandler = new ThirdHandler();

        firstHandler.setNext(secondHandler);
        secondHandler.setNext(thirdHandler);

        firstHandler.handleRequest("Type2");
        firstHandler.handleRequest("Type1");
        firstHandler.handleRequest("Type3");

    }
}
