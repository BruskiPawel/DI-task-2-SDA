package com.example.dependency_injection_task_2_sda.cmd;

import com.example.dependency_injection_task_2_sda.DummyLogger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SecondBeanCmd implements CommandLineRunner {

    private DummyLogger dummyLogger;

    public SecondBeanCmd(@Qualifier("secondBeanImp") DummyLogger dummyLogger) {
        this.dummyLogger = dummyLogger;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Second bean CMD runner");
        dummyLogger.sayHello();
    }
}
