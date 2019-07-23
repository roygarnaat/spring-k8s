package io.blueharvest.service_caller.controller;

import io.blueharvest.service_caller.service.ServiceCaller;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(CallerController.class)
public class HttpRequestTest {


    public static final String CALLER_ENDPOINT = "/caller";

    public static final String ENDPOINT_RESPONSE = "Caller Service: ";

    public static final String SERVICE_1_RESPONSE = "Service 1";

    public static final String SERVICE_2_RESPONSE = "Service 2";

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ServiceCaller caller;


    @Test
    public void callerShouldReturnStringService1() throws Exception {
        when(caller.callService1()).thenReturn("Service 1");

        this.mockMvc.perform(get(CALLER_ENDPOINT + "?service=1")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString(ENDPOINT_RESPONSE + SERVICE_1_RESPONSE)));
    }

    @Test
    public void callerShouldReturnStringService2() throws Exception {
        when(caller.callService2()).thenReturn("Service 2");

        this.mockMvc.perform(get(CALLER_ENDPOINT + "?service=2")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString(ENDPOINT_RESPONSE + SERVICE_2_RESPONSE)));    }

}
