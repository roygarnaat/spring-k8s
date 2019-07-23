package io.blueharvest.service_2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceTwoController {

    @GetMapping("/service")
    public String getServiceNumber() {
        return "Service 2";
    }
}

