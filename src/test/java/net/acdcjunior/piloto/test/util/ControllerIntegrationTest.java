package net.acdcjunior.piloto.test.util;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/piloto-servlet.xml")
public abstract class ControllerIntegrationTest {
	
    @Autowired
    private WebApplicationContext wac;
    
    protected MockMvc buildMockMvc() {
		return MockMvcBuilders.webAppContextSetup(this.wac).build();
	}

}