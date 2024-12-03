package com.syang176.business;

import com.syang176.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Syang176
 **/

@Service
public class DemoBusiness {
    private final DemoService demoService;

    @Autowired
    public DemoBusiness(DemoService demoService) {
        this.demoService = demoService;
    }

    public String say(String message) {
        return demoService.say(message);
    }


}
