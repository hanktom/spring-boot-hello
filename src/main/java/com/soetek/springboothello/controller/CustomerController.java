package com.soetek.springboothello.controller;

import com.soetek.springboothello.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/customer/count")
    public long count(){
        return customerService.getCount();
    }
}
