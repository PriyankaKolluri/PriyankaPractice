package com.narendra.test;

import com.narendra.test.controller.ReactiveController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
public class ReactiveControllerTest {

    private MockMvc mockMvc;

    @InjectMocks
    private ReactiveController reactiveController;

    @Before
    public void setUp(){

        reactiveController = new ReactiveController();
        mockMvc = MockMvcBuilders.standaloneSetup(reactiveController).build();

    }

    @Test
    public void shouldReturnSuccess() throws Exception{

        mockMvc.perform(get("/reactive/hello").contentType(MediaType.APPLICATION_JSON)).andDo(print()).andExpect(status().isOk());
    }
}
