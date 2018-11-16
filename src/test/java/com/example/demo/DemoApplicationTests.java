package com.example.demo;

import com.example.demo.controller.IndexController;
import com.sun.org.apache.xerces.internal.util.Status;
import javafx.animation.Animation;
import javafx.scene.media.MediaPlayer;
import jdk.net.SocketFlow;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import sun.misc.ObjectInputFilter;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	private MockMvc mockMvc;

	@Before
	public  void before(){
		this.mockMvc= MockMvcBuilders.standaloneSetup(new IndexController()).build();
	}
	@Test
	public void contextLoads() {
		RequestBuilder req=get("/index");
		//mockMvc.perform(req).andExpect(Status().isOk());
	}

}
