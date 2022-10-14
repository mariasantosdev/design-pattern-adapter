package alura;

import alura.api.ClientApiAdapter;
import alura.api.RandomAdvice;
import alura.api.RickAndMortyJaphethsMiddleSon;
import alura.api.YodaTranslate;

import java.net.URISyntaxException;

public class Main {
        public static void main(String[] args) throws URISyntaxException {
            YodaTranslate yodaTranslate = new YodaTranslate();
            new ClientApiAdapter(yodaTranslate);

            yodaTranslate.get();

            RandomAdvice randomAdvice = new RandomAdvice();
            new ClientApiAdapter(randomAdvice);

            randomAdvice.get();

            RickAndMortyJaphethsMiddleSon rickAndMortyJaphethsMiddleSon = new RickAndMortyJaphethsMiddleSon();
            new ClientApiAdapter(rickAndMortyJaphethsMiddleSon);

            rickAndMortyJaphethsMiddleSon.get();
    }
}
