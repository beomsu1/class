package com.hi.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Log4j2
public class TodoDeleteController {

    @RequestMapping("/todo/delete")
    public String delete(
            @RequestParam("tno") int tno
    ){
    log.info("/todo/delete");

    log.info("삭제 요청 번호 : " + tno);
    return "redirect:/todo/list";
    }
}
