package com.joaodev.desafio2;

public class Utilitarios {

    public static Usuario fromPessoaToUsuario(Pessoa pessoa){
        return new Usuario(pessoa.getId(), pessoa.getEmail());
    }
}
