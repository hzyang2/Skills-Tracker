package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
    @GetMapping
    @ResponseBody
    public String main(){
        String content=""+
                "<html>"+
                "<body>"+
                "<h1>Skills Tracker"+
                "</h1>"+
                "<h2>We have a few skills we would like to learn. Here is the list!"+
                "</h2>"+
                "<ol>"+
                "<li>Java</li>"+
                "<li>JavaScript</li>"+
                "<li>Python</li>"+
                "</ol>"+
                "</body>"+
                "</h1>"+
                "</html>";
        return content;
    }

    @GetMapping("/form")
    @ResponseBody
    public String getForm(){
        String content=""+
                "<html>"+
                "<body>"+
                "<form method='post'>"+
                "Name:<br/><input type='text' name='name' /><br/>"+
                "My favorite language:<br/>"+
                "<select name='firstChoice'>"+
                    "<option>Java</option>"+
                    "<option>JavaScript</option>"+
                    "<option>Python</option>"+
                "</select><br/>"+
                "My second favorite language:<br/>"+
                "<select name='secondChoice'>"+
                "<option>Java</option>"+
                "<option>JavaScript</option>"+
                "<option>Python</option>"+
                "</select><br/>"+
                "My third favorite language:<br/>"+
                "<select name='thirdChoice'>"+
                "<option>Java</option>"+
                "<option>JavaScript</option>"+
                "<option>Python</option>"+
                "</select><br/>"+
                "<input type='submit' />"+
                "</form>"+
                "</body>"+
                "</html>";
        return content;
    }

    @PostMapping("/form")
    @ResponseBody
    public String postForm(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice){
        String content=""+
                "<html>"+
                "<body>"+
                "<h1>" + name+ "</h1>"+
                "<ol>"+
                "<li>"+firstChoice+"</li>"+
                "<li>"+secondChoice+"</li>"+
                "<li>"+thirdChoice+"</li>"+
                "</ol>"+
                "</body>"+
                "</h1>"+
                "</html>";
        return content;
    }
}
