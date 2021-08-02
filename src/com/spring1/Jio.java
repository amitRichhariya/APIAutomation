package com.spring1;

public class Jio {
    private Service service;

    public void setService(Service service) {
        this.service = service;
    }

    public void callService()
    {
        service.service();
    }
}
