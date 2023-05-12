package com.hi.app.controller;

import com.hi.app.domain.ModifyTodoRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Log4j2
@RequestMapping("/todo/modify")
public class TodoModifyController {

    @RequestMapping(method = RequestMethod.GET)
    public String getModify(Model model){
        log.info("get /todo/modify");

        model.addAttribute("todo","todo");

        return "todo/modifyForm";
    }
    @RequestMapping(method = RequestMethod.POST)
    public String postModify(
            @ModelAttribute("modifyData") ModifyTodoRequest modifyTodoRequest
    ){
        log.info("post /todo/modify");

        log.info("modifyTodoRequest : " + modifyTodoRequest);
        return "todo/modify";
        //return "redirect:/todo/list";
    }
}
