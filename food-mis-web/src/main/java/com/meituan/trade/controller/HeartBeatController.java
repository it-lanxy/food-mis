package com.meituan.trade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: lanxinyu@meituan.com  2018-11-13 下午3:31
 * @Description: 心跳检测
 */
@Controller
public class HeartBeatController {

    private static final String HEART_BEAT_VIEW = "../heartbeat";

    @GetMapping({ "/", "/heartbeat", "/monitor/alive"})
    public String heartBeat() {
        return HEART_BEAT_VIEW;
    }

}
