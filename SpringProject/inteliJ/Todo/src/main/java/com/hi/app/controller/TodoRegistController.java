package com.hi.app.controller;

import com.hi.app.domain.TodoRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Log4j2
@RequestMapping("/todo/regist")
public class TodoRegistController {

    @RequestMapping(method = RequestMethod.GET)
    public String getRegistForm(){

    log.info("get /todo/regist");

        return "/todo/registForm";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String regist(
            Model model,
            String todo,
            String duedate,
            @RequestParam(value = "todo" , required = false) String requestTodo,
            @RequestParam(value = "duedate",defaultValue = "2023-05-12") String requestDuedate,
            TodoRequest todoRequest

    ){
        log.info("post /todo/regist");

        log.info("todo : " + todo);
        log.info("duedate : " + duedate);

        log.info("requestTodo : " + requestTodo);
        log.info("requestDuedate : " + requestDuedate);

        log.info("todorequest : " + todoRequest);

        model.addAttribute("todo",todo); // 속성값을 넣어줘야 el태그를 사용할 때 값을 불러올 수 있음.
        model.addAttribute("duedate",duedate);
        return "todo/regist";
       // return "redirect:/todo/list";
    }
}
