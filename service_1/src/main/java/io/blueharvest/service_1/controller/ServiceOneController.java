package io.blueharvest.service_1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceOneController {

    @GetMapping("/service")
    public String getServiceNumber() {
        return "Service 1";
    }
}
