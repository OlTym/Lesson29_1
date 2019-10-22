package com.tym;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping
    public String main(@RequestParam(name = "title", required = false) String title,
                       @RequestParam(name = "text", required = false) String text,
                       Map<String, Object> model) {

        model.put("title", title);
        model.put("text", text);

        return "main";
    }

}
