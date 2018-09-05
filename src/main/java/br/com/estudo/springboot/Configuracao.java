package br.com.estudo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Created by rafaelsantos on 30/08/2018.
 */

@ComponentScan(basePackages={"br.com.estudo.springboot"})
@SpringBootApplication
public class Configuracao {

    public static void main(String[] args) {
        SpringApplication.run(Configuracao.class, args);
    }


    @Bean
    public DataSource dataSource(){
        System.out.println("Initia Bean");
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/listavip");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        return  dataSource;
    }


}
