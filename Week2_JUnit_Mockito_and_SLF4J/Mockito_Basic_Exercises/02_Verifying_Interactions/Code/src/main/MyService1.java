package com.example.junitdemo;

public class MyService1 {
    private ExternalAPI api;

    public MyService1(ExternalAPI api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }
}