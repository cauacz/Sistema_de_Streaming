package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private int episodiosPorTemporada;
    private int duracaoDoEpisodio;
    private boolean ativa;

    //Método Construtor de Serie
    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemportadas(){
        return temporadas;
    }

    public void setTemporadas(int temporadas){
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada(){
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada){
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getDuracaoDoEpisodio(){
        return duracaoDoEpisodio;
    }

    public void setDuracaoDoEpisodio(int duracaoDoEpisodio){
        this.duracaoDoEpisodio = duracaoDoEpisodio;
    }

    public boolean inAtiva(){
        return ativa;
    }

    public void setAtiva(boolean ativa){
        this.ativa = ativa;
    }

    // Sobrescrevendo o método "duraçãoEmMinutos".
    // Esse método se comporta de forma diferente em Serie
    // A duração de uma série é medida de forma diferente de um filme
    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * duracaoDoEpisodio;
    }


}
