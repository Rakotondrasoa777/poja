package com.poja.learn.endpoint.rest.controller.hello;

import com.poja.learn.service.HelloWorldService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
  private final HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping("/hello")
  public String helloWorld() {
    return "Hello World";
  }

  @GetMapping("/uploadHello")
  public String uploadHello(@RequestParam String name) {
    return helloWorldService.uploadHelloWorldMessage(name);
  }
}
