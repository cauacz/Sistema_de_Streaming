package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificacao;

public class Episodio implements Classificacao {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalAvaliacao;
    private int totalVisualizacao;

    public int getTotalAvaliacao() {
        return totalAvaliacao;
    }

    public void setTotalAvaliacao(int totalAvaliacao) {
        this.totalAvaliacao = totalAvaliacao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getClassificacao(){
        if(totalVisualizacao > 100){
            return 4;
        }else{
            return 2;
        }
    }
}
