package com.sparta.springmvc.html;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HtmlController {

    private static long visitCount =0;


    //static 폴더에 정적인 html 파일에 접근하기 위한 방법
    //1. tymeleaf 주석을 풀어서 기본 폴더 templates 에서 찾는 것을 막는다.
    //2. redirect를 이용해 접근
    @GetMapping("/static-hello")
    public String hello() {
        return "hello.html";
    }

    @GetMapping("/html/redirect")
    public String htmlStatic() {
        return "redirect:/hello.html";
    }

    //templates 폴더 안에 있는 html에 접근할때는 파일의 이름만 반환하면된다.
    @GetMapping("/html/templates")
    public String htmlTemplates() {
        return "hello";
    }

    @GetMapping("/html/dynamic")
    public String htmlDynamic(Model model){
        visitCount++;
        model.addAttribute("visits",visitCount);
        return "hello-visit";
    }

}
