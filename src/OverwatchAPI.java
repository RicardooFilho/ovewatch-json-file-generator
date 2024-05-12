import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class OverwatchAPI {

    public static Hero getHeroInformations(String heroName) throws IOException, InterruptedException {

        URI heroInfoURL = URI.create(String.format("https://overfast-api.tekrop.fr/heroes/%s", heroName));

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(heroInfoURL)
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return new Gson().fromJson(response.body(), Hero.class);
    }
}
