package com.example.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 周瑶
 * @description TODO
 * @Date: 2018/11/14
 */
@Controller
@RequestMapping(value="error")
public class BaseErrorController implements ErrorController {
    public static  final Logger LOGGER= LoggerFactory.getLogger(BaseErrorController.class);
    @Override
    public String getErrorPath() {
        LOGGER.info("出错了！进入自定义错误控制器！");
        return "error/error";

    }


    @RequestMapping
    public String error(){
        return getErrorPath();
    }
}
