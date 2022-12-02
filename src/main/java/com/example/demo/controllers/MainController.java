package com.example.demo.controllers;
import org.springframework.stereotype.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String greeting(Model model) {
        return "home";
    }

    @GetMapping("/p")
    public String greet(Model model) {
        return "Post";
    }

    @PostMapping("/Post")
    public String PostRes(@RequestParam(value = "first",  required = false)
                          String a,@RequestParam(value = "Znak",  required = false, defaultValue = "")
                          String b,@RequestParam(value = "second",  required = false)
                          String c, Model model) {
        double itog;
        try {
            if (b.equals("+")) {
                itog = Double.parseDouble(a) + Double.parseDouble(c);
                model.addAttribute("znaki", itog);
            }
            if (b.equals("-")) {
                itog = Double.parseDouble(a) - Double.parseDouble(c);
                model.addAttribute("znaki", itog);
            }
            if (b.equals("*")) {
                itog = Double.parseDouble(a) * Double.parseDouble(c);
                model.addAttribute("znaki", itog);
            }
            if (b.equals("/") && !c.equals("0")) {
                itog = Double.parseDouble(a) / Double.parseDouble(c);
                model.addAttribute("znaki", itog);
            }
        } catch (NumberFormatException e) {
            model.addAttribute("znaki", "Вы не выбрали значения");
        }
        return "Result";
    }

    @GetMapping("/Get")
    public String GetRes(@RequestParam(value = "first",  required = false) String a,
                         @RequestParam(value = "Znak",  required = false, defaultValue = "") String b,
                         @RequestParam(value = "second",  required = false)
                         String c, Model model) {
        double itog;
        try {
            if (b.equals("+")) {
                itog = Double.parseDouble(a) + Double.parseDouble(c);
                model.addAttribute("znaki", itog);
            }
            if (b.equals("-")) {
                itog = Double.parseDouble(a) - Double.parseDouble(c);
                model.addAttribute("znaki", itog);
            }
            if (b.equals("*")) {
                itog = Double.parseDouble(a) * Double.parseDouble(c);
                model.addAttribute("znaki", itog);
            }
            if (b.equals("/") && !c.equals("0")) {
                itog = Double.parseDouble(a) / Double.parseDouble(c);
                model.addAttribute("znaki", itog);
            }
        } catch (NumberFormatException e) {
            model.addAttribute("znaki", "Вы не выбрали значения");
        }
        return "Get";
    }
}