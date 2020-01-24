package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    /*
    At localhost:8080, add text that states the three possible programming languages someone could be working on. You need to have an h1 with the title “Skills Tracker”, an h2, and an ol containing three programming languages of your choosing.
    Also at localhost:8080/form, updating HTML with an h1 stating the user’s name and an ol showing the three programming languages in the order they chose
    */
    //@RequestMapping(method = {RequestMethod.POST}, value = "/form")
    @PostMapping("/form")
    public static String languagesText(@RequestParam String visitor,
                                       @RequestParam String firstLanguage,
                                       @RequestParam String secondLanguage,
                                       @RequestParam String thirdLanguage){
        String headStr = "<h1>Skills Tracker</h1>" +
                "<h2>Programming languages</h2>";
        String str = "<ol>" +
                        "<li>"+firstLanguage+"</li>" +
                        "<li>"+secondLanguage+"</li>" +
                        "<li>"+thirdLanguage+"</li>" +
                    "</ol>";

        return headStr + "Hello <span style=\"color:navy; font-weight: bold;\">"+ visitor + "</span>!, below are your choices:" + str;
    }

    /*
    * Reformat form page to use a table instead of an ordered list
    */
    /*
    @PostMapping("/form")
    public static String bonusLanguagesText(@RequestParam String visitor,
                                       @RequestParam String firstLanguage,
                                       @RequestParam String secondLanguage,
                                       @RequestParam String thirdLanguage){
        String headStr = "<h1>Skills Tracker of <span style=\"color:navy; font-weight: bold;\">" +
                visitor + "</span>!</h1>" +
                "<h2>Programming languages</h2>";

        String str = "<table style=\"border: 1px solid black\">" +
                    "<tr>" +
                        "<th style=\"border: 1px solid black\">First language</th>" +
                        "<th style=\"border: 1px solid black\">Second language</th>" +
                        "<th style=\"border: 1px solid black\">Third language</th>" +
                    "</tr>" +
                    "<tr>" +
                        "<td style=\"text-align: center; border: 1px solid black\">"+firstLanguage+"</th>" +
                        "<td style=\"text-align: center; border: 1px solid black\">"+secondLanguage+"</th>" +
                        "<td style=\"text-align: center; border: 1px solid black\"h>"+thirdLanguage+"</th>" +
                    "</tr>"+
                "</table>";
        return headStr + str;
    }
    */

    /*
    At localhost:8080/form, a form that lets the user enter their name and choose their favorite,
    second favorite, and third favorite programming languages on your list.
    Select elements are used for each of the rankings
    */
    @RequestMapping(method = {RequestMethod.GET}, value = "/form")
    public String formText(){
        String str = "<html>" +
                "<body>" +
                "<form action='/form' method='POST'>" + // submit a request to /myLang
                    "<label>Name: <br><input type='text' name='visitor'></label><br><br>" +
                    "My favorite language:<br>" +
                    "<select  name=\"firstLanguage\" id=\"language-select\">\n" +
                    "  <option value=\"C++\">C++</option>" +
                    "  <option value=\"Java\">Java</option>" +
                    "  <option value=\"C\">C</option>\n" +
                    "  <option value=\"Python\">Python</option>\n" +
                    "  <option value=\"C#\">C#</option>\n" +
                    "  <option value=\"JavaScript\">JavaScript</option>\n" +
                    "</select><br><br>" +
                    "My second favorite language:<br>" +
                    "<select  name=\"secondLanguage\" id=\"language-select\">\n" +
                    "  <option value=\"C++\">C++</option>" +
                    "  <option value=\"Java\">Java</option>" +
                    "  <option value=\"C\">C</option>\n" +
                    "  <option value=\"Python\">Python</option>\n" +
                    "  <option value=\"C#\">C#</option>\n" +
                    "  <option value=\"JavaScript\">JavaScript</option>\n" +
                    "</select><br><br>" +
                    "My third favorite language:<br>" +
                    "<select  name=\"thirdLanguage\" id=\"language-select\">\n" +
                    "  <option value=\"C++\">C++</option>" +
                    "  <option value=\"Java\">Java</option>" +
                    "  <option value=\"C\">C</option>\n" +
                    "  <option value=\"Python\">Python</option>\n" +
                    "  <option value=\"C#\">C#</option>\n" +
                    "  <option value=\"JavaScript\">JavaScript</option>\n" +
                    "</select><br><br>" +
                    "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
        return str;
    }
}

