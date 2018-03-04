package com.peyman.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Peyman on 3/4/2018.
 */
@Controller

public class HomeController {
    private static final Logger logger = Logger.getLogger(HomeController.class);
    @RequestMapping("/home")
    @ResponseBody
    public String goHome(){
        logger.info("in go home method");
        return "Welcome Home!!!";
    }

    @RequestMapping("/home2")
    public String goHome2(){
        logger.info("salam");
        return "home";
    }

}
