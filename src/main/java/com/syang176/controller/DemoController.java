package com.syang176.controller;

import com.syang176.business.DemoBusiness;
import com.syang176.common.entity.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Syang176
 * @date 2024/12/2 21:45
 **/

@Controller
@RequestMapping
public class DemoController {

    private final DemoBusiness demoBusiness;

    @Autowired
    public DemoController(DemoBusiness demoBusiness) {
        this.demoBusiness = demoBusiness;
    }

    @ResponseBody
    @RequestMapping("/hello")
    public R sayHello() {
        return R.ok(demoBusiness.say("hello,spring"));
    }

}
