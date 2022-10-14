package alura.api;

public class YodaTranslate implements HttpAdapter {
    @Override
    public void makeRequest() {
        new ClientApiAdapter(this).makeAGetRequest("https://api.funtranslations.com/translate/yoda.json?text=Master%20Obiwan%20has%20lost%20a%20planet.");
    }
}
