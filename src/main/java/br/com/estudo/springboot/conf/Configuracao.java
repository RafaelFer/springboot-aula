package br.com.estudo.springboot.conf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by rafaelsantos on 30/08/2018.
 */
@ComponentScan("br.com.estudo.springboot")
@SpringBootApplication
public class Configuracao {

    public static void main(String[] args) {
        SpringApplication.run(Configuracao.class, args);
    }

}
