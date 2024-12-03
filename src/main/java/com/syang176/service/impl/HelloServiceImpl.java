package com.syang176.service.impl;

import com.syang176.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author Syang176
 * @date 2024/12/2 21:47
 **/

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String message) {
        return message;
    }
}
