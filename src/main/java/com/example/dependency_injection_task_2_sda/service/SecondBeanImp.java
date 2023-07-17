package com.example.dependency_injection_task_2_sda.service;

import com.example.dependency_injection_task_2_sda.DummyLogger;
import org.springframework.stereotype.Service;

@Service
public class SecondBeanImp implements DummyLogger {
    @Override
    public void sayHello() {

        System.out.println("Hello from the second one !");
    }
}
