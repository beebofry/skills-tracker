package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("")
    public String languageDisplay(){
        return "<html>" +
                    "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>Wow, take a look at this list!</h2>" +
                        "<ol>" +
                            "<li>JavaScript</li>" +
                            "<li>Java</li>" +
                            "<li>Python</>" +
                        "</ol>" +
                    "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String languageForm(){
        return "<html>" +
                "<body>" +
                "<form method='post'>" +
                "Name:<br>" +
                "<input type='text' name='name'><br>" +

                "My favorite language: <br>" +
                "<select name='language1'>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +

                "My second favorite language: <br>" +
                "<select name='language2'>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +

                "My third favorite language: <br>" +
                "<select name='language3'>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +

                "<br><input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("form")
    public String favoriteLanguageReport(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3){
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + language1 + "</li>" +
                "<li>" + language2 + "</li>" +
                "<li>" + language3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
}
