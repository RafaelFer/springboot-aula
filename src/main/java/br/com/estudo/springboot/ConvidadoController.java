package br.com.estudo.springboot;

import br.com.estudo.springboot.model.Convidado;
import br.com.estudo.springboot.repository.ConvidadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping(value = "salvar", method = RequestMethod.POST)
    public String salvar(Model model, @RequestParam("nome") String nome , @RequestParam("email") String email , @RequestParam("telefone") String telefone){


        repository.save(new Convidado(nome,email,telefone));

        Iterable<Convidado> convidados = repository.findAll();

        model.addAttribute("convidados",convidados);

        System.out.println("Passou "+nome);
        return "listaconvidados";
    }
}
