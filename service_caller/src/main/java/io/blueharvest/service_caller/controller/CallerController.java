package io.blueharvest.service_caller.controller;

import io.blueharvest.service_caller.service.ServiceCaller;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RequiredArgsConstructor
@RestController
public class CallerController {

    @NonNull
    private final ServiceCaller service;

    @GetMapping("/caller")
    public String callerString(@RequestParam("service") @NotNull String number) {
        String result;
        if (number.equals("1")) {
            result = service.callService1();
        } else {
            result = service.callService2();
        }
        return "Caller Service: " + result;
    }


}
