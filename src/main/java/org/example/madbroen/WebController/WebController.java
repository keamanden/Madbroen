package org.example.madbroen.WebController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.example.madbroen.TestUser;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WebController {


    @GetMapping("/{page}")
    public String dynamic(@PathVariable String page) {
        return "pages/" + page;
    }

    @GetMapping("/")
    public String index() {
        return "pages/index";
    }

    //get mapping for login
    @GetMapping("/login")
    public String showLogin() {
        return "pages/login";
    }

    //post mapping for login
    @PostMapping("/login")
    public String fakeLogin(
            @RequestParam String email,
            @RequestParam String password) {
        // no real auth yet — just redirects somewhere else
        return "redirect:/index";
    }

    //get mapping for signup
    @GetMapping("/signup")
    public String showSignupPage() {
        return "pages/signup";
    }

    //post mapping for signup
    @PostMapping("/signup")
    public String processSignup(
            @RequestParam String companyName,
            @RequestParam String contactName,
            @RequestParam String phone,
            @RequestParam String cvr,
            @RequestParam String address,
            @RequestParam String email,
            @RequestParam String companyType,
            @RequestParam String password,
            @RequestParam String confirmPassword
    ) {
        // no method to save data — just redirects somewhere else
        return "redirect:/index";
    }

    //get mapping for contact page
    @GetMapping("/contact-page")
    public String showContactPage() {
        return "pages/contact-page";
    }

    //post mapping for contact page
    @PostMapping("/contact")
    public String processContactForm(
            @RequestParam String email,
            @RequestParam String message
    ) {
        // print statements for testing/debug
        System.out.println("Kontakt fra: " + email);
        System.out.println("Besked: " + message);

        // just redirects somewhere else
        return "redirect:/index";
    }

    @GetMapping("/dashboard")
    public String showTestPage(Model model) {
        model.addAttribute("user", new TestUser("Acme A/S", "Main Street 1", "info@acme.dk",
                12345678, 87654321, "John Doe",
                "distributionCompany", 42, true, "Some input"));

        List<TestUser> donorCompanys = new ArrayList<TestUser>();
        List<TestUser> soupKitchens = new ArrayList<TestUser>();
       donorCompanys.add(new TestUser(
                "Acme A/S",
                "Side Street 1",
                "info@acme.dk",
                12345678,
                87654321,
                "John Doe",
                "donorCompany",
                1,
                true,
                "First test input"
        ));

        donorCompanys.add(new TestUser(
                "Cargo ApS",
                "Warehouse Lane 7",
                "support@cargo.dk",
                99887766,
                55667788,
                "Peter Jensen",
                "donorCompany",
                5,          // palletCount
                true,
                "Third test input"
        ));


        donorCompanys.add(new TestUser(
                "Cargo ApS",
                "Warehouse Lane 7",
                "support@cargo.dk",
                99887766,
                55667788,
                "Peter Jensen",
                "donorCompany",
                5,          // palletCount
                true,
                "Third test input"
        ));


        soupKitchens.add(new TestUser(
                "Acme A/S",
                "High Street 1",
                "info@acme.dk",
                12345678,
                87654321,
                "John Doe",
                "soupKitchen",
                1,          // palletCount
                true,
                "First test input"
        ));

        soupKitchens.add(new TestUser(
                "Cargo ApS",
                "Long Lane 7",
                "support@cargo.dk",
                99887766,
                55667788,
                "Peter Jensen",
                "soupKitchen",
                5,          // palletCount
                true,
                "Third test input"
        ));


        soupKitchens.add(new TestUser(
                "Cargo ApS",
                "Short Lane 7",
                "support@cargo.dk",
                99887766,
                55667788,
                "Peter Jensen",
                "soupKitchen",
                5,          // palletCount
                true,
                "Third test input"
        ));




        model.addAttribute("soupKitchens", soupKitchens);
        model.addAttribute("donorCompanys", donorCompanys);
        model.addAttribute("users", new TestUser());
        return "pages/dashboard";
    }



    @GetMapping("/hello")
    public String page() {
        return "pages/aboutus";
    }


}
