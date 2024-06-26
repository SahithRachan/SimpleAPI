package com.example.Arthimetic_operations;

public class Mathoperationsresponse {
    private final String operation;
    private final float value1;
    private final float value2;
    private final float result;

    public Mathoperationsresponse(String operation, float value1, float value2, float result) {
        this.operation = operation;
        this.value1 = value1;
        this.value2 = value2;
        this.result = result;
    }

    // Getters for JSON serialization
    public String getOperation() {
        return operation;
    }

    public float getValue1() {
        return value1;
    }

    public float getValue2() {
        return value2;
    }

    public float getResult() {
        return result;
    }
}
