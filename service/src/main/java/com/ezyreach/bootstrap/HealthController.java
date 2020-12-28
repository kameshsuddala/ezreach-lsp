package com.ezyreach.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @Autowired
    public HealthController() {
    }


    @GetMapping(path = "/health")
    public String health(){
        return "Up";
    }
}
