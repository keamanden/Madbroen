package org.example.madbroen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



    @Controller
    public class HeaderController {
        @GetMapping("fragments/header")
        public String header() {
            return "fragments/header";
        }
    }



