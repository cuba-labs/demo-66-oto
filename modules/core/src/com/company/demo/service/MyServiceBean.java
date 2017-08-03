package com.company.demo.service;

import org.springframework.stereotype.Service;

@Service(MyService.NAME)
public class MyServiceBean implements MyService {

    @Override
    public String echo(String value) {
        return value;
    }
}