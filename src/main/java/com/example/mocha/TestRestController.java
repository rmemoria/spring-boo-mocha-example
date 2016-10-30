package com.example.mocha;

import org.springframework.web.bind.annotation.*;

/**
 * Created by rmemoria on 29/10/16.
 */
@RestController
@RequestMapping("/api")
public class TestRestController {

    @RequestMapping(value = "/hello", method = RequestMethod.POST, consumes = { "text/plain" })
    @ResponseBody
    public String sqyHello(@RequestBody String name) {
        System.out.println(name);
        return "Hello " + name;
    }
}
