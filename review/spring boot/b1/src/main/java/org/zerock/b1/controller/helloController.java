package org.zerock.b1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class helloController {

    @GetMapping("hello")
    public void hello(){
        log.info("hello~");
    }
    
}
