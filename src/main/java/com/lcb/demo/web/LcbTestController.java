package com.lcb.demo.web;

import com.lcb.demo.pojo.Param;
import com.lcb.demo.pojo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class LcbTestController {

    @GetMapping("/test")
    public String test(){
        return "success";
    }

    @PostMapping("/test2")
    public Result test2(@RequestBody Param map){

        Result result = new Result();
        result.setCode(200);
        result.setMsg("success");
        result.setData(map);
        return result;
    }
}
