package com.example.dependency_injection_task_2_sda.cmd;

import com.example.dependency_injection_task_2_sda.DummyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class primaryBeanCmd implements CommandLineRunner {


    private final DummyLogger dummyLogger;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Primary bean CMD runner");
        dummyLogger.sayHello();
    }
}
