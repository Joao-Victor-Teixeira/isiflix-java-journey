package com.joaodev.aulacollections.core;

import java.util.Objects;

public class Produto {

    private int id;
    private String descricao;
    private double preco;

    public Produto() {
    }

    public Produto(int id, String descricao, double preco) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto [id=" + id + ", descricao=" + descricao + ", preco=" + preco + "]";
    }

    @Override
    public boolean equals(Object o){
        if (o == this) {
            return true; // se apontam para a mesma referência, então é o mesmo objeto
        }
        if (o.getClass() != this.getClass()) {
            return false; // se as classes são diferentes, então nem precisa comparar nada
        }
        // agora que ja sao objetos diferentes da mesma classe, preciso conferir os conteudos
        Produto p = (Produto)o;
        return (p.id == this.id && p.descricao.equals(this.descricao) && p.preco == this.preco);
    }

    @Override
    public int hashCode(){
        // representação numerica do objeto
        // serve para calcular qual vai ser a posição do objeto pra ser armazenada no vetor 
        return Objects.hash(id, descricao, preco);
    }

}
