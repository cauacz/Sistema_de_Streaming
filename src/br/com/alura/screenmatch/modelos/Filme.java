package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificacao;

public class Filme extends Titulo implements Classificacao {
    private String diretor;

    // Método Construtor de Filme
    public Filme(String nome, int anoDeLancamento){
        super(nome, anoDeLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao(){
        return (int) obterMedia() / 2;
    }

    @Override
    // Sobrescrevendo o método toString, para melhor leitura
    public String toString(){
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
