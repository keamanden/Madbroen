

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * PageController - Håndterer HTTP requests til alle statiske sider
 *
 * I stedet for at have 6 forskellige controllers (AboutUsController, LandingController, osv.)
 * bruger vi ONE universal controller der håndterer alle sider.
 *
 * Dette er meget mere vedligeholdelsesvenligt!
 *
 * @Controller betyder at denne klasse håndler web requests
 */
@Controller
public class PageController {

    /**
     * Landing Page - Forsiden
     *
     * URL: http://localhost:8080/
     * eller: http://localhost:8080/index
     * Template: src/main/resources/templates/index.html
     *
     * @GetMapping("/") eller @GetMapping("/index") betyder:
     *   - Håndler HTTP GET requests til root eller /index
     *   - Returnerer index.html template
     *
     * @return String - Navn på template filen (index.html)
     */
    @GetMapping({"/", "/index"})
    public String landingPage() {
        // Returnerer index.html
        // Spring Boot søger i /src/main/resources/templates/index.html
        return "index";
    }

    /**
     * About Us Side
     *
     * URL: http://localhost:8080/om-os
     * Template: src/main/resources/templates/about_us.html
     *
     * @return String - Navn på template filen (about_us.html)
     */
    @GetMapping("/om-os")
    public String aboutUs() {
        return "aboutus";
    }

    /**
     * Contact / Kontakt Side
     *
     * URL: http://localhost:8080/kontakt
     * Template: src/main/resources/templates/contact.html
     *
     * @return String - Navn på template filen (contact.html)
     */
    @GetMapping("/kontakt")
    public String contact() {
        return "contact";
    }

    /**
     * Dashboard Side (for brugere der logger ind)
     *
     * URL: http://localhost:8080/dashboard
     * Template: src/main/resources/templates/dashboard.html
     *
     * @return String - Navn på template filen (dashboard.html)
     */
    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }

    /**
     * Login Side
     *
     * URL: http://localhost:8080/login
     * Template: src/main/resources/templates/login.html
     *
     * @return String - Navn på template filen (login.html)
     */
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    /**
     * Signup / Registrering Side
     *
     * URL: http://localhost:8080/signup
     * Template: src/main/resources/templates/signup.html
     *
     * @return String - Navn på template filen (signup.html)
     */
    @GetMapping("/signup")
    public String signup() {
        return "signup";
    }

    /**
     * BONUSMETODER - Du kan tilføje flere efter behov
     */

    /**
     * Privacy Policy Side
     *
     * URL: http://localhost:8080/privatlivspolitik
     * Template: src/main/resources/templates/privacy.html
     */
    @GetMapping("/privatlivspolitik")
    public String privacy() {
        return "privacy";
    }

    /**
     * Terms & Conditions Side
     *
     * URL: http://localhost:8080/vilkaar
     * Template: src/main/resources/templates/terms.html
     */
    @GetMapping("/vilkaar")
    public String terms() {
        return "terms";
    }

    /**
     * DYNAMISK SIDE HÅNDTERING (AVANCERET)
     *
     * Hvis du senere vil have RIGTIG mange sider, kan du gøre det dinamisk:
     *
     * @GetMapping("/{page}")
     * public String dynamicPage(@PathVariable String page) {
     *     // Denne metode vil håndtere ANY URL og lede til tilsvarende template
     *     // Fx: /min-side -> min-side.html
     *     // OBS: Skal være SIDST i controlleren, da den matcher alt!
     *     return page;
     * }
     */

}