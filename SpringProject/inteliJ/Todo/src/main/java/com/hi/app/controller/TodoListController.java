package com.hi.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
public class TodoListController {

    @RequestMapping("/todo/list")
    public void getList(Model model){

        model.addAttribute("todoList","todo");
    }
}
