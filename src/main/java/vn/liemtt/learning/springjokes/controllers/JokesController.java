package vn.liemtt.learning.springjokes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import vn.liemtt.learning.springjokes.services.JokesService;

@Controller
public class JokesController {
    private final JokesService jokesService;

    public JokesController(final JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @GetMapping({"/", ""})
    public String jokes(Model model) {
        model.addAttribute("jokes", jokesService.getJokes());
        return "index";
    }
}
