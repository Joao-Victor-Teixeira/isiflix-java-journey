package com.joaodev.universipi.main;

import java.util.Scanner;

import com.joaodev.universipi.core.Questao;
import com.joaodev.universipi.core.QuestaoComDica;
import com.joaodev.universipi.core.QuestaoMultiplaEscolha;

public class Simulado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pontos = 0;
        String minhaResposta;

        Questao questoes[] = new Questao[5];
        questoes[0] = new QuestaoComDica("Quanto vale 1+1?", "2","Responda a representação numerica");
        questoes[1] = new Questao("Quem descobriu o Brasil", "Pedro Alvares Cabral");
        questoes[2] = new QuestaoMultiplaEscolha("Qual a formula da água?","b","H2O2","H2O","NACL","H2SO4");
        questoes[3] = new QuestaoComDica("Qual a linguagem desse curso?", "Java", "Começa com \"Ja\" e termina com \"VA\"");
        questoes[4] = new Questao("Qual o nome do professor?", "Isidro");



        for (Questao q : questoes) {
            System.out.println(q.aplicarQuestao());
            System.out.print("Resposta: ");
            minhaResposta = sc.nextLine();
            if (q.corrigir(minhaResposta)) {
                pontos++;
                System.out.println("Acertou");
            } else {
                System.out.println("Errrrrrroooooooooooooooooouuuuuuuuuu");
            }
        }

        System.out.println("Total de acertos: " + pontos + " de " + questoes.length);

        sc.close();
    }
}
