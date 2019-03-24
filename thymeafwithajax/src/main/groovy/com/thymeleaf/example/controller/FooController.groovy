package com.thymeleaf.example.controller

import com.sun.javafx.sg.prism.NGShape
import com.thymeleaf.example.model.SearchInfo
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.ModelAndView

/**
 * Created by vijay R
 */
@RestController
class FooController {

    @GetMapping("/greeting")
    String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
    @PostMapping('/ajax/test')
    ModelAndView ajxCall(SearchInfo searchInfo){
        println " Text data :${searchInfo.text}"
        ModelAndView modelAndView = new ModelAndView(viewName: 'test')
        modelAndView.addObject('data',searchInfo.text)
        modelAndView
    }
    
}
