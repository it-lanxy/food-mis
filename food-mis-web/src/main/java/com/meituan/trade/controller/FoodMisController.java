package com.meituan.trade.controller;

import com.alibaba.fastjson.JSON;
import com.meituan.foodmis.element.ManualRequest;
import com.meituan.trade.service.FoodMisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



/**
 * @author: lanxinyu@meituan.com  2018-12-17 2:07 PM
 * @Description:
 */
@Controller
public class FoodMisController {

    @Autowired
    private FoodMisService foodMisService;

    @PostMapping(value = "/foodmis", params = "list")
    public String list(final ManualRequest manualRequest, Model model) {
        System.out.println(JSON.toJSONString(manualRequest));
        return pageFile("maidan","orderlist", model);
    }

    @GetMapping(value = "/foodmis/{bizCode}/{bizGoal}")
    public String pageFile(@PathVariable String bizCode, @PathVariable String bizGoal,Model model) {
        System.err.println("bizCode :" + bizCode);
        System.err.println("bizGoal :" + bizGoal);
        model.addAttribute("picture", foodMisService.getPicture(bizCode));
        model.addAttribute("pageFile", foodMisService.getPageFile());
        return "pagefile";
    }

    @GetMapping(value = "/foodmis")
    public String home() {
        return "home";
    }

}
