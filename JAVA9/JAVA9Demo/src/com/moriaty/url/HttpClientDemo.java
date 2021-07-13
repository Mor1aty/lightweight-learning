package com.moriaty.url;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * <p>
 * HttpClientDemo
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/13 18:56
 */
public class HttpClientDemo {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest.Builder builder = HttpRequest.newBuilder(new URI("https://utest.21kunpeng.com"));
        HttpRequest request = builder.header("user-agent", "moriaty").GET().build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.statusCode());
        System.out.println(response.body());

    }
}
