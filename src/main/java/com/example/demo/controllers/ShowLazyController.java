package com.example.demo.controllers;

import com.example.demo.domain.TestBean88002000600;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
final class ShowLazyController {

    final private TestBean88002000600 testBean88002000600;

    public ShowLazyController(@Lazy TestBean88002000600 testBean88002000600) {
        this.testBean88002000600 = testBean88002000600;
    }

    @RequestMapping("/lazy")
    public String foo() {
        return testBean88002000600.someMethod();
    }
}
