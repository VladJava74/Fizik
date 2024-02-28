package com.example.Fizik;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MController {
    @GetMapping("/main")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        return "main";
    }
}
