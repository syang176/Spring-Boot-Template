package com.syang176.business;

import com.syang176.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Syang176
 * @date 2024/12/2 21:46
 **/

@Service
public class DemoBusiness {
    private final HelloService helloService;

    @Autowired
    public DemoBusiness(HelloService helloService) {
        this.helloService = helloService;
    }

    public String say(String message) {
        return helloService.sayHello(message);
    }


}
