package com.sagarandcompany.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {
    @GetMapping("/home/get")
    public Map<String, String> get() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "sagar");
        map.put("age", "28");
        map.put("email", "sagarmal624@gmail.com");
        map.put("address", "Gurgaon");
        return map;
    }
}
