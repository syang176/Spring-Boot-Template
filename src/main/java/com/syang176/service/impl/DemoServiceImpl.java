package com.syang176.service.impl;

import com.syang176.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * @author Syang176
 **/

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String say(String message) {
        return message;
    }
}
