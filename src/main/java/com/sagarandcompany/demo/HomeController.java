package com.sagarandcompany.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {
    @Autowired
    NotificationService notificationService;

    @GetMapping("/home/get")
    public Map<String, String> get() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "vandana");
        map.put("age", "28");
        map.put("email", "sagarmal624@gmail.com");
        map.put("address", "HYD");
        return map;
    }
    @GetMapping("/home/person/get")
    public Map<String, String> personget() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "sagar");
        map.put("age", "100");
        map.put("email", "sagarmal624@gmail.com");
        map.put("address", "Jaipur");
        return map;
    }
}
