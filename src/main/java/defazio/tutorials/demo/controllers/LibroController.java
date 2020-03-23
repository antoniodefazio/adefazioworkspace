package defazio.tutorials.demo.controllers;

import defazio.tutorials.demo.service.AutoreService;
import defazio.tutorials.demo.service.LibroService;
import defazio.tutorials.demo.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LibroController {

    private LibroService libroService;

    private AutoreService autoreService;

    private WelcomeService welcomeService;

    public LibroController(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }

    @Autowired
    public void setLibroService(LibroService libroService) {
        this.libroService = libroService;
    }
    @Autowired
    public void setAutoreService(AutoreService autoreService) {
        this.autoreService = autoreService;
    }

    @RequestMapping("/libri")
    public String getLibri(Model model){
model.addAttribute("books",libroService.libriDto());
        model.addAttribute("welcome",welcomeService.welcome());
return "books";
    }
    @RequestMapping({"","/","/autori"})
    public String getAutori(Model model){
        model.addAttribute("autori",autoreService.autoriDto());
        model.addAttribute("welcome",welcomeService.welcome());
        return "autori";
    }

}
