package com.zhg.docker.docker_demo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试接口
 *
 * @author qq943
 * @date 2020/12/07 18:43
 **/
@RestController
@Log4j2
public class HelloController {

    @GetMapping(value = "hello")
    public String hello(){
        System.out.println("hello!");
        log.info("hello-log1");
        return "hello world！";
    }
}
