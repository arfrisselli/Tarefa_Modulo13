package com.people;

import java.util.HashSet;
import java.util.Set;

/**
 * @author andrey.rf
 */
public class Pessoa {

    private String nome;
    private Set<PessoaFisica> pessoasFisicas;
    private Set<PessoaJuridica> pessoasJuridicas;

    public Pessoa() {
        this.pessoasFisicas = new HashSet<>();
        this.pessoasJuridicas = new HashSet<>();
    }

    public void add(PessoaFisica pf) {
        this.pessoasFisicas.add(pf);
    }

    public void add(PessoaJuridica pj) {
        this.pessoasJuridicas.add(pj);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
