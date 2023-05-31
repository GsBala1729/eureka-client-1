package com.tekb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyRestController {

    @Autowired
    RestTemplate restTemplate;

    String url = "http://application-b/testb";

    @GetMapping("/testa")
    public String restTest(){

        ResponseEntity<String> response =  restTemplate.getForEntity(url, String.class);
        System.out.println(response);
        return "I am application A";
    }
}
