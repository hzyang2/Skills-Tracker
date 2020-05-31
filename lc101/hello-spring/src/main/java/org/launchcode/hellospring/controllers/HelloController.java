package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
//@ResponseBody
//@RequestMapping("hello")
public class HelloController {

    // Handles request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

//    // lives /hello/goodbye
//    @GetMapping("goodbye")
//    @ResponseBody
//    public String goodbye() {
//        return "Goodbye, Spring!";
//    }

     //lives /hello/goodbye
    // Handles request of the form /hello?name=LaunchCode
    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    public String hello(@RequestParam String name, Model model) {
        String greeting = "Helloe, " + name + "!";
        model.addAttribute("greeting",greeting);
        return "Hello";
    }
//
    // Handles requests of the form /hello/LaunchCOde
    @GetMapping("hello/{name}")
    public String helloAgain(@PathVariable String name, Model model) {
        model.addAttribute("greeting", "Helloe, " + name + "!");
        return "hello";
    }

    @GetMapping("form")
    public String helloForm() {
        return "form";
    }
//
//    @GetMapping("hello-names")
//    public String helloNames(Model model) {
//        List<String> names = new ArrayList<>();
//        names.add("LaunchCOde");
//        names.add("Java");
//        names.add("JavaScript");
//        model.addAttribute("names", names);
//        return "hello-list";
//    }

    @GetMapping("coffee-names")
        public String coffeeNames(Model model) {
           List<String> names = new ArrayList<>();
           names.add("French Roast");
           names.add("Espresso");
           names.add("Kopi Luwak");
           names.add("Instant");
           model.addAttribute("names", names);
           return "coffee-list";
        }


}
