package ChainOfResponsibility;

public class ThirdHandler extends AbstractHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("Type3")) {
            System.out.println("ThirdHandler обрабатывает запрос: " + request);
        } else {
            super.handleRequest(request);
        }
    }
}
