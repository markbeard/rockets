package com.nbb.microservices.rockets;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class Fire2Controller {

    private static final String template = "Hello, %s! you look like shit today.";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/fire2")
    public Fire2 fire2(@RequestParam(value="name", defaultValue="World") String name) {
        return new Fire2(counter.incrementAndGet(),
                String.format(template, name));
    }
}