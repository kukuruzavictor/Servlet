package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HTTPClient {
    public static void main (String [] args){

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest [] request= new HttpRequest [5];

         request[0] = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8080/login"))
                .GET()
                .header("User-Agent", "Java 11")
                .build();
         request[1] = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8080/checkbox"))
                .GET()
                .header("User-Agent", "Java 11")
                .build();
         request[2] = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8080/radiobutton"))
                .GET()
                .header("User-Agent", "Java 11")
                .build();
         request[3] = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8080/select"))
                .GET()
                .header("User-Agent", "Java 11")
                .build();
         request[4] = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8080/feedback"))
                .GET()
                .header("User-Agent", "Java 11")
                .build();


        try {
            HttpResponse<String> [] response = new HttpResponse[5];

            for (int i=0; i<response.length; i++){
                response[i] = client.send(request[i], HttpResponse.BodyHandlers.ofString());
                if (response[i].statusCode()==200){
                    System.out.println(request[i].uri());
                    System.out.println(response[i].body());
                } else {
                    System.out.println("Something went wrong.");
                }
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
