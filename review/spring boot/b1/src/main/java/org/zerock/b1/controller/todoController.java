package org.zerock.b1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@RequestMapping("/todo/")
@Log4j2
public class todoController {
    
    @GetMapping("list")
    public void list(){
        log.info("list...");
    }

    @GetMapping("add")
    public void add(){
        log.info("add...");
    }

    @GetMapping("read/{tno}")
    public String read(@PathVariable("tno") Long tno){
        log.info("read...");

        return "/todo/read";
    }

    @GetMapping("modify/{tno}")
    public String modify(@PathVariable("tno") Long tno){
        log.info("modify...");

        return "/todo/modify";
    }

    @PostMapping("add")
    public String addPost(){
        log.info("addPost...");

        return "redirect:/todo/list";
    }

    @PostMapping("modify/{tno}")
    public String modifyPost(@PathVariable("tno") Long tno){
        log.info("modifyPost...");

        return "redirect:/todo/read/"+tno;
    }

    @PostMapping("remove")
    public String remove(){
        log.info("remove...");

        return "redirect:/todo/list";
    }

}
