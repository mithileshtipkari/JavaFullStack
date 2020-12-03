package com.example.allinone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import static org.mockito.Mockito.when;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.containsString;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import com.example.allinone.HelloController;
import com.example.allinone.service.HelloService;
import org.springframework.boot.test.mock.mockito.MockBean;
 

//@SpringBootTest
//@AutoConfigureMockMvc
// instead of both use @WebMvcTest
@WebMvcTest(HelloController.class)
class AllinoneApplicationTests {
        @Autowired
	private MockMvc mockMvc;
        
        @MockBean
        private HelloService helloService;
        
        @Test
        public void greetingShouldReturnMessageFromService() throws Exception {
            when(helloService.message()).thenReturn("mith");
            this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk()).andExpect(content().string(containsString("mith")));
        }

//	@Autowired
//	private HelloController controller;
//
//	@Test
//	public void contextLoads() throws Exception {
//		assertThat(controller).isNotNull();
//	}
        
        //using testRestTemplate to make a request
//        @Test
//        public void greetingShouldReturnDefaultMessage() throws Exception {
//		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/",
//				String.class)).contains("Hello");
//	}
        
//        @Test
//	public void shouldReturnDefaultMessage() throws Exception {
//		this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
//				.andExpect(content().string(containsString("mith")));
//	}
        
        
}

