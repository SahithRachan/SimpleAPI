package com.example.Arthimetic_operations;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationsController {

    @GetMapping("/math/{operation}/{value1}/{value2}")
    public Mathoperationsresponse calculate(
            @PathVariable String operation,
            @PathVariable float value1,
            @PathVariable float value2) {
        float result;
        switch (operation) {
            case "subtract":
                result = value1 - value2;
                break;
            case "add":
                result = value1 + value2;
                break;
            case "multiply":
                result = (value1 )* (value2);
                break;
            case "divide":
                if (value2 != 0) {
                    result = value1 / value2;
                } else {
                    throw new IllegalArgumentException("Cannot divide by Zero!");
                }
                break;
            default:
                throw new IllegalArgumentException("Unsupported operation: " + operation);
        }
        return new Mathoperationsresponse(operation, value1, value2, result);
    }
}
