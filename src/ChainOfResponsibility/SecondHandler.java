package ChainOfResponsibility;

public class SecondHandler extends AbstractHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("Type2")) {
            System.out.println("SecondHandler обрабатывает запрос: " + request);
        } else {
            super.handleRequest(request);
        }
    }
}
