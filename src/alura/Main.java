package alura;

import alura.api.ClientApiAdapter;
import alura.api.RandomAdvice;
import alura.api.RickAndMortyJaphethsMiddleSon;
import alura.api.YodaTranslate;

public class Main {
        public static void main(String[] args) {
            YodaTranslate yodaTranslate = new YodaTranslate();
            new ClientApiAdapter(yodaTranslate);

            yodaTranslate.makeRequest();

            RandomAdvice randomAdvice = new RandomAdvice();
            new ClientApiAdapter(randomAdvice);

            randomAdvice.makeRequest();

            RickAndMortyJaphethsMiddleSon rickAndMortyJaphethsMiddleSon = new RickAndMortyJaphethsMiddleSon();
            new ClientApiAdapter(rickAndMortyJaphethsMiddleSon);

            rickAndMortyJaphethsMiddleSon.makeRequest();
    }
}
