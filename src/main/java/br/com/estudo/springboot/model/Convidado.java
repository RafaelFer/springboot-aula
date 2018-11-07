package br.com.estudo.springboot.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * Created by rafaelsantos on 03/09/2018.
 */
@Entity(name="convidado")
public class Convidado {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    private String email;

    private String telefone;

    @Transient
    private String telefoneFmt;

    public Convidado() {
    }

    public Convidado(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getTelefoneFmt() {
        return telefoneFmt;
    }

    public void setTelefoneFmt(String telefoneFmt) {
        this.telefoneFmt = telefoneFmt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


}
