package pl.edu.wszib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShoopController {

    @GetMapping
    public String welcome(){
        return "welcome";
    }
    @GetMapping("shipping")
    public String shipping(Model model){
        model.addAttribute("shippingMethodName1", "Paczkomat");
        model.addAttribute("shippingMethodName2", "Kurier - przedpłata");
        model.addAttribute("shippingMethodName3", "Kurier - pobranie");
        model.addAttribute("shippingMethodPrice1",10.5);
        model.addAttribute("shippingMethodPrice2",15.00);
        model.addAttribute("shippingMethodPrice3",10.20);
        return "shipping";
    }
}
