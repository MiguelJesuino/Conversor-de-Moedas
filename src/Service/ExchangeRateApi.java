package Service;

import Models.ConversionRate;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class ExchangeRateApi {

    public ConversionRate buscaMoeda(String moeda){
        String apiKey = System.getenv("EXCHANGERATE_API_KEY");

        URI link = URI.create("https://v6.exchangerate-api.com/v6/"+apiKey+"/latest/"+moeda);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(link).build();


        try {
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), ConversionRate.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
