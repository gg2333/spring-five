package me.master.springfive.http;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class HttpRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

//        onTest();
    }

    private void onTest() {
        WebClient.create()
                .get()
                .uri("https://api.github.com")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class)
                .subscribe(System.out::println, System.out::println);
    }


}
