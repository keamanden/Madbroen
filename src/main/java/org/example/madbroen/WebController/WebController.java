package org.example.madbroen.WebController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.example.madbroen.TestUser;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController {




    @GetMapping("/dashboard")
    public String index() {
        return "pages/dashboard";
    }

    @GetMapping("/test")
    public String showTestPage(Model model) {
        model.addAttribute("user", new TestUser("Acme A/S", "Main Street 1", "info@acme.dk",
                12345678, 87654321, "John Doe",
                "donorCompany", 42, true, "Some input"));
        model.addAttribute("userType", "donorCompany");
        return "pages/dashboard";
    }
    @GetMapping("/hello")
    public String hello() {
        return "pages/test";
    }


}
