package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangqiang
 * @Date: 2022/2/20 15:22
 */
@Controller
@RequestMapping("test")
public class testApps {

    @RequestMapping("abc")
    public String getTest(){
        return "bootstrap01-html";
    }
}
