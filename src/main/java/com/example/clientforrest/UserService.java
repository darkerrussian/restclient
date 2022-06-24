package com.example.clientforrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class UserService {


    WebClient webClient;

    private static final String url = "http://localhost:8080/";

    public UserService( WebClient.Builder builder){
        webClient = builder.baseUrl(url).build();
    }

    public User [] getUsers(){
        return webClient
                .get()
                .uri("/users").retrieve()
                .bodyToMono(User[].class).block();
    }

}
