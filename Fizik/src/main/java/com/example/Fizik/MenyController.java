package com.example.Fizik;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenyController {
    @GetMapping("/meny")
    public String meny(Model model) {
        model.addAttribute("title","Страница ...");
        return "meny";
    }
    @GetMapping("/T1")
    public String T1(Model model) {
        model.addAttribute("title","Механика");
        return "T1";
    }
    @GetMapping("/T2")
    public String T2(Model model) {
        model.addAttribute("title","Термодинамика");
        return "T2";
    }
    @GetMapping("/T3")
    public String T3(Model model) {
        model.addAttribute("title","Электричество");
        return "T3";
    }
    @GetMapping("/T4")
    public String T4(Model model) {
        model.addAttribute("title","Оптика");
        return "T4";
    }
    @GetMapping("/T5")
    public String T5(Model model) {
        model.addAttribute("title","Ядерная физика");
        return "T5";
    }
}
