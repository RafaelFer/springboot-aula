package br.com.estudo.springboot;

import br.com.estudo.springboot.model.Convidado;
import br.com.estudo.springboot.repository.ConvidadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by rafaelsantos on 30/08/2018.
 */
@Controller
public class ConvidadoController {

    @Autowired
    private ConvidadoRepository repository;

    @RequestMapping("/")
    public String helloWorld() {
        return "index";
    }

    @RequestMapping("/listaconvidados")
    public String listaConvidados(Model model) {

        Iterable<Convidado> convidados = repository.findAll();
        model.addAttribute("convidados",convidados);
        return "listaconvidados";
    }
}