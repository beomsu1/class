package com.hi.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
public class TodoReadController {

    @RequestMapping("/todo/read")
    public String read(Model model){
        model.addAttribute("todo","todo");

        return "todo/read";
    }
}
