package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        Scanner scanner = new Scanner(System.in);
        ObjectMapper mapper = new ObjectMapper();

        System.out.println("Enter a JSON string: ");
        String jsonLine = scanner.nextLine();

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




    }
}