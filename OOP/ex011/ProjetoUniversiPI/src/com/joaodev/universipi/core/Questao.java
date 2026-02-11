package com.joaodev.universipi.core;

public class Questao {

    protected String enunciado;
    protected String resposta;

    public Questao() {
    }

    public Questao(String enunciado, String resposta) {
        this.enunciado = enunciado;
        this.resposta = resposta;
    }


    public String aplicarQuestao() {
        return "Q:" + this.enunciado;
    }

    public boolean corrigir(String respAluno) {
        return this.resposta.equals(respAluno);
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    
}
