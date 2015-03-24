package jp.co.rakuten.checkout.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringController {
    
    @RequestMapping("/")
    public String showHome(Model model){
        
        model.addAttribute("name", "Max");
        return "Home";
    }

}
