package br.com.microservice.application.web.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import br.com.microservice.application.web.controller.HealthCheckController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HealthCheckControllerTest {

	private MockMvc mockMvc;
	
	@Autowired
	private HealthCheckController controller;
	
	@Before
	public void setup() throws Exception {
		this.mockMvc = MockMvcBuilders.standaloneSetup(this.controller).build();
	}
	
	@Test
	public void testGetHealthCheck() throws Exception {

        mockMvc.perform(get("/healthCheck").contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$", is("Healthcheck Service Ok!")));
	}

}
