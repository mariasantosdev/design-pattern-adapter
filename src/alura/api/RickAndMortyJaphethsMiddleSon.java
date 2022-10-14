package alura.api;

public class RickAndMortyJaphethsMiddleSon implements HttpAdapter {

    @Override
    public void makeRequest() {
        new ClientApiAdapter(this).makeAGetRequest("https://rickandmortyapi.com/api/character/676");
    }
}
