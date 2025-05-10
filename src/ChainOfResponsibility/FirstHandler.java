package ChainOfResponsibility;

public class FirstHandler extends AbstractHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("Type1")) {
            System.out.println("FirstHandler обрабатывает запрос: " + request);
        } else {
            super.handleRequest(request);
        }
    }
}
