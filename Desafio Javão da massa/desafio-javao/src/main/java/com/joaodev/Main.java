package com.joaodev;

import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.joaodev.desafio2.Dia03;
import com.joaodev.desafio2.Dia04;
import com.joaodev.desafio2.Dia05;
import com.joaodev.desafio2.Dia06;
import com.joaodev.desafio2.Dia07;
import com.joaodev.desafio2.Dia08;
import com.joaodev.desafio2.DiaGenerico;
import com.joaodev.desafio2.Pessoa;

public class Main {
    public static void main(String[] args) {
        try {

            String jsonStr = new String(Files.readAllBytes(Paths.get("pessoas.json")));
            Gson gson = new Gson();
            Type type = new TypeToken<List<Pessoa>>() {}.getType();

            List<Pessoa> lista = gson.fromJson(jsonStr, type);

            /*
             * lista.forEach(p -> System.out.println(p));
             * 
             * Pessoa novaPessoa = new Pessoa(151, "Joao", "joao@joao", "987.654.321-00",
             * 28);
             * List<Pessoa> res1 = lista.stream().toList(); // toList gera uma lista
             * imutavel
             * 
             * List<Pessoa> res2 = lista.stream().collect(Collectors.toList()); //
             * collect(Collectors) gera uma lista mutavel
             * res2.add(novaPessoa);
             * System.out.println(res2);
             */

            DiaGenerico dia = new Dia08();
            dia.executarDesafio(lista);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}