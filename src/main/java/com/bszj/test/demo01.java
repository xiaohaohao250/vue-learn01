package com.bszj.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class demo01 {

    @Value(value = "server.port")
    private String portNo;

    @RequestMapping(value = "test")
    public String index(){
        String htmlName= "";
        if("8181".equals(portNo)){
            htmlName = "index";
        }else if("8182".equals(portNo)){
            htmlName = "index02";
        }
        return htmlName;
    }
}
