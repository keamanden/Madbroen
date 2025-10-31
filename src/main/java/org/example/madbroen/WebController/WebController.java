package org.example.madbroen.WebController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.example.madbroen.TestUser;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WebController {


    @GetMapping("/{page}")
    public String dynamic(@PathVariable String page) {
        return "pages/" + page;
    }

    @GetMapping("/dashboard")
    public String index() {
        return "pages/dashboard";
    }

    @GetMapping("/test")
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
                1,          // palletCount
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
