package com.meituan.trade.controller;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * @author: lanxinyu@meituan.com  2018-11-13 下午5:31
 * @Description:
 */
public class HeartBeatControllerTest {

    @Test
    public void heartBeat() throws Exception {
        HeartBeatController controller = new HeartBeatController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller)
                .build();
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(
                        MockMvcResultMatchers.view().name("../heartbeat")
                ).andDo(MockMvcResultHandlers.print());
    }
}
