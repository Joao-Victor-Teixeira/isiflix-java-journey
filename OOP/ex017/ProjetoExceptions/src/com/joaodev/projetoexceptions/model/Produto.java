package com.joaodev.projetoexceptions.model;

import com.joaodev.projetoexceptions.exceptions.JoaoException;

public class Produto {
    private int id;
    private String descricao;

    public int getId() {
        return id;
    }

    public void setId(int id) throws JoaoException {
        if (id <= 0) {
            throw new JoaoException("ID nao pode ser zero ou negativo");
        }
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void JoaoException(String descricao) throws JoaoException {
        if (descricao == null || descricao.length() == 0) {
            throw new JoaoException("Descricao precisa ser obrigatoria");
        }
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Produto [id=" + id + ", descricao=" + descricao + "]";
    }

}
