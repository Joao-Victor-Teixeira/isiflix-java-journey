package com.joaodev.universipi.core;

public class QuestaoComDica extends Questao {

    private String dica;

    public QuestaoComDica(String dica) {
        this.dica = dica;
    }

    public QuestaoComDica(String enunciado, String resposta, String dica) {
        super(enunciado, resposta);
        this.dica = dica;
    }

    @Override
    public String aplicarQuestao() {
        return super.aplicarQuestao() + "\n" + "  (Dica: " + this.dica + ")";
    }

    public String getDica() {
        return dica;
    }

    public void setDica(String dica) {
        this.dica = dica;
    }

}
