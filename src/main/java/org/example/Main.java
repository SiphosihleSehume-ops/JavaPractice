package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        User newUser = new User("Mike", 30);

        //Serialization (POJO -> JSON String)
        String json = mapper.writeValueAsString(newUser);

        System.out.println(json);

        //Deserialization: (JSON String -> POJO)
        String jsonInput;
        System.out.println("Enter any text as a JSON string...");

        String jsonInput




    }
}