package ChainOfResponsibility;

public class AbstractHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(String request) {
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
