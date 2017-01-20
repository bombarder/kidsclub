package com.kidsclub.controller;

import com.kidsclub.model.Entertainment;
import com.kidsclub.service.EntertainmentService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

public class EntertainmentControllerTest {

    @Mock
    private EntertainmentService entertainmentService;

    @InjectMocks
    private EntertainmentController entertainmentController;

    private MockMvc mockMvc;

    @Before
    public void setup(){

        // Process mock annotations
        MockitoAnnotations.initMocks(this);

        // Setup Spring test in standalone mode
        this.mockMvc = MockMvcBuilders.standaloneSetup(entertainmentController).build();
    }

    @Test
    public void saveEntertainment() throws Exception {
        MvcResult returnedResult = this.mockMvc.perform(post("/entertainment/add"))
                .andReturn();
        String url = returnedResult.getResponse().getRedirectedUrl();
        Assert.assertEquals("/entertainment/all", url);
        verify(entertainmentService, times(1)).save(any(Entertainment.class));
        verifyNoMoreInteractions(entertainmentService);
    }
}
