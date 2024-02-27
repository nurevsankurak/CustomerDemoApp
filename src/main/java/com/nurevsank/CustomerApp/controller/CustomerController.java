package com.nurevsank.CustomerApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {
    private final CustomerService customerService;

}
