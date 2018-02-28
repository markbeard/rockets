package com.nbb.microservices.rockets;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Fire1Controller {

    private static final String template = "Hello, %s! you look like nice today.";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/fire1")
    public Fire1 fire1(@RequestParam(value="name", defaultValue="World") String name) {
        return new Fire1(counter.incrementAndGet(),
                String.format(template, name));
    }
}