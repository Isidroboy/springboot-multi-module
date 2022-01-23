package com.tbb.system.controller;

import com.tbb.system.entity.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author G
 * @date 1/23/22 6:29 PM
 */
@RestController
public class PersonController {

    @ResponseBody
    @GetMapping("/")
    public String hello() {
        Person person = new Person("12","G");
        return person.toString();
    }
}
