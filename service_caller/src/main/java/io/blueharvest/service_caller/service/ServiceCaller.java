package io.blueharvest.service_caller.service;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Service
public class ServiceCaller {

    private final String baseUrl = "http://";

    private final String url1 = "service-1:";

    private final String url2 = "service-2:";

    private final int port1 = 8989;

    private final int port2 = 8888;


    @NonNull
    RestTemplate restTemplate;

    public String callService1() {
        return restTemplate.getForObject(baseUrl + url1 + port1 + "/service", String.class);
    }

    public String callService2() {
        return restTemplate.getForObject( baseUrl + url2 + port2 + "/service", String.class);
    }

}
