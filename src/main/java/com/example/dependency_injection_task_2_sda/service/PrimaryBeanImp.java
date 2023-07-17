package com.example.dependency_injection_task_2_sda.service;

import com.example.dependency_injection_task_2_sda.DummyLogger;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryBeanImp implements DummyLogger {
    @Override
    public void sayHello() {
        System.out.println("Hello from Primary bean !");
    }
}
