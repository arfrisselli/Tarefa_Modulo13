package com.people;

/**
 * @author andrey.rf
 */
public class App {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        PessoaFisica pf = new PessoaFisica();
        pf.setNome("Mickey");
        pf.setSobrenome("Mouse");
        pf.setCpf("123.456.789-10");

        PessoaJuridica pj = new PessoaJuridica();
        pj.setRazaoSocial("Disney Land LTDA");
        pj.setNomeFantasia("Disney Land");
        pj.setCnpj("12.345.678/0001-11");

        pessoa.add(pf);
        pessoa.add(pj);
    }
}
