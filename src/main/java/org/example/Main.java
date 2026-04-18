package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        Scanner scanner = new Scanner(System.in);
        ObjectMapper mapper = new ObjectMapper();

        //Configure ObjectMapper first
        //Graceful Error Handling; Don't crash if a client sends in a field your Request class doesn't have
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        //Make the output pretty for your own debugging logs
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        System.out.println("Enter a JSON string: ");
        String jsonLine = scanner.nextLine();

        try {
            //Deserialize
            Request request = mapper.readValue(jsonLine, Request.class);
            System.out.println("Request command: " + request.getCommand());

            //Mimicking Server logic
            Robot robot = new Robot();
            RobotState currentState = new RobotState();

            Response response = new Response(
                    "OK",
                    robot,
                    currentState
            );

            //Serialize Output
            String jsonResponse = mapper.writerWithDefaultPrettyPrinter()
                    .writeValueAsString(response);

            System.out.println(jsonResponse);
        } catch (JsonProcessingException e) {
            System.err.println("Error: " + e.getMessage());
        }

    }
}