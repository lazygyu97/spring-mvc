package com.sparta.springmvc.response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/response")
public class ResponseController {

    //@ResponseBody가 없다면 return 값에 반환된 이름을 가진 html 템플릿을 찾기 때문에
    //데이터 자체를 반환값으로 주고 싶다면 @ResponseBody를 사용해야한다.

    // [Response header]
    //   Content-Type: text/html
    // [Response body]
    //   {"name":"Robbie","age":95}
    @GetMapping("/json/string")
    @ResponseBody
    public String helloStringJson() {

        return "{\"name\":\"Robbie\",\"age\":95}";
    }

    //class 를 json으로 활용

    // [Response header]
    //   Content-Type: text/html
    // [Response body]
    //   {"name":"Robbie","age":95}
    @GetMapping("/json/class")
    @ResponseBody
    public Star helloClassJson(){
        return new Star("Star",12);
    }

}
