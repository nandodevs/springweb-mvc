package br.com.nandodevs.springwebmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.nandodevs.springwebmvc.model.Jedi;

@Controller
public class JediController {
    
    @GetMapping("/jedi")
    public ModelAndView jedi(){

        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("jedi");
        modelAndView.addObject("allJedi", new Jedi(name, lastName));
        return modelAndView;
    }
}
