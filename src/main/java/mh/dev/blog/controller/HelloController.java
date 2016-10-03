package mh.dev.blog.controller;

import mh.dev.blog.annotation.RestApiController;
import mh.dev.blog.model.Hello;
import org.springframework.web.bind.annotation.RequestMapping;

@RestApiController("hello")
public class HelloController {

    @RequestMapping
    public Hello all() {
        Hello hello = new Hello();
        hello.setText("Hello api");
        return hello;
    }
}
