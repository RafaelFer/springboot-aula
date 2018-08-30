package br.com.estudo.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by rafaelsantos on 30/08/2018.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String helloWorld(){
        return "index";
    }

}
