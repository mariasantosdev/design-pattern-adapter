package alura.api;

public class RandomAdvice implements HttpAdapter {
    @Override
    public void makeRequest() {
        new ClientApiAdapter(this).makeAGetRequest("https://api.adviceslip.com/advice");
    }
}
