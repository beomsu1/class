package com.hi.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
@Log4j2
public class LoginController {

    @RequestMapping(method = RequestMethod.GET) // login으로 Get방식으로 들어왔을떄만 사용
    public String loginForm() {
        log.info("get | /login");
        return "member/loginForm";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String login() {
        log.info("post | /login");
        // post 처리 후 redirect
        return "redirect:/sample/sample1"; // 절대경로
        // http://localhost:8080/sample/sample1

    }
}

