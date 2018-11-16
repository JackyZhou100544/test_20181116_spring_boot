package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 周瑶
 * @description TODO
 * @Date: 2018/11/13
 */
@Controller
@RequestMapping("/web")
public class WebController {

    private final static  Logger logger= LoggerFactory.getLogger(WebController.class);

    @RequestMapping("index")
    public String index(ModelMap map){
        logger.info("这里是controller");
        map.put("title","hello world");
        return "index";

    }

    @RequestMapping("demo1")
    public String showIndex(ModelMap map){
        logger.info("这里是controller");
        map.put("title","hello world");
        return "demo1";

    }
}
