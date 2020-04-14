package ru.zuma.agroback.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.zuma.agroback.model.out.HelloWorldResponse;

@Slf4j
@RestController
@RequestMapping("/api/v1/hello")
@RequiredArgsConstructor
public class HelloWorldController {

    @GetMapping("/")
    public HelloWorldResponse helloWorld() {
        return new HelloWorldResponse("Hello world!");
    }
}
