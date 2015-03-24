package jp.co.rakuten.checkout.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringController {
    
    @RequestMapping("/")
    public String showHome(HttpSession session){
        
        session.setAttribute("Name", "Max");
        return "Home";
    }

}
