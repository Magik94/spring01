package com.example.demo.controller;

/**
 * Created by Dawid on 10.09.2017.
 */


        import org.springframework.http.MediaType;
        import org.springframework.ui.ModelMap;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.bind.annotation.RestController;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")

public class WidgetController {

    @RequestMapping(method = RequestMethod.GET)
//    public Widget index() {
//        return new Widget("green", 10, 7);
//    }
    public String sayHello(ModelMap model) {
        model.addAttribute("greeting", "Heello World from Spring 4 MVC");
        return "welcome";
    }
    @RequestMapping(value = "/look", method = RequestMethod.GET)
    public String start(ModelMap model)  {
        model.addAttribute("greeting", "Witaj w sklepie internetowym");
        model.addAttribute("tabline", "Wyjątkowym i jednym sklepie internetowym");

        return " welcome" ;
    }

}