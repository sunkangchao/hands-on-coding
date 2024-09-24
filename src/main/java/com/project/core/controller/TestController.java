package com.project.core.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController
 *
 * @author sunkangchao
 * @version 1.0
 * @since <pre>09月 23, 2024</pre>
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/start")
    public String test() {
        return "test";
    }

}
