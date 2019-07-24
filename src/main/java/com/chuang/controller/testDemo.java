package com.chuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wuchuang
 * @create 2018-11-19 17:17
 */
@Controller
@RequestMapping("/hello")
public class testDemo {

    @ResponseBody
    @RequestMapping("/word")
    public Map<String,Object> getMapDemo(){
        Map<String,Object> map = new HashMap<>();
        map.put("Dmeo1","测试");
        map.put("Dmeo2","测试2");

        return map;
    }
}
