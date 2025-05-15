package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.UnknownHostException;

@Controller
public class HomeController {

    /**
     * get Home Page
     *
     * @return {@link String}
     * @see String
     * <p>
     * IF we have @RequestBody on top of the method then it is considered as content
     * If we @GetMapping on top of the method then it is considered as file
     * when you say (value ="/") it means homepage
     */
    @GetMapping(value = "/")
    public String getHome() throws UnknownHostException {
        // model.addAttribute("hostname", Inet4Address.getLocalHost().getHostName());
        // it will be considered as a file ( jsp) not as content
        //tomcat jasper dependency render jsp to servlet to display UI
        return "/WEB-INF/views/home.jsp";
    }

    @PostMapping(value = "/addCustomer")
    public String createCustomer(Model model, @RequestParam String firstName, @RequestParam String lastName, @RequestParam String email, @RequestParam String phone) {
        // Create Customer is
        model.addAttribute("fName", firstName);
        model.addAttribute("lName", lastName);
        model.addAttribute("mail", email);
        model.addAttribute("number", phone);

        return "/WEB-INF/views/success.jsp";
    }


}
