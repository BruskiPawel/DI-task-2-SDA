package com.example.dependency_injection_task_2_sda.cmd;

import com.example.dependency_injection_task_2_sda.DummyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
@RequiredArgsConstructor
@Component
public class AllBeansCmd implements CommandLineRunner {

    private final List<DummyLogger> dummyLoggerList;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("all beans CMD runner");
        dummyLoggerList.forEach(log -> log.sayHello());
    }
}
