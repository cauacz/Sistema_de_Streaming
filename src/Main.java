import br.com.alura.screenmatch.calculos.CalculadoraTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Criando um Filme
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibirFichaTecnica();
        meuFilme.avaliar(8);
        meuFilme.avaliar(5);
        meuFilme.avaliar(10);
        System.out.println("Total de Avalições: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações: " + meuFilme.obterMedia());

        // Criando uma Série
        Serie serie = new Serie();
        serie.setNome("Prison Break");
        serie.setAnoDeLancamento(2005);
        serie.setIncluidoNoPlano(true);
        serie.exibirFichaTecnica();

        serie.setAtiva(true);
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(20);
        serie.setDuracaoDoEpisodio(60);
        System.out.println("Temporadas: " + serie.getTemportadas() + " temporadas");
        System.out.println("Episódios por temporada: " + serie.getEpisodiosPorTemporada() + " episódios");
        System.out.println("Duração: " + serie.getDuracaoEmMinutos() + " minutos");

        //Criando outro  Filme
        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);
        outroFilme.setIncluidoNoPlano(true);

        //Calculando o tempo da lista de Filmes salvos
        CalculadoraTempo calculadora = new CalculadoraTempo();
        calculadora.somarTempo(meuFilme);
        calculadora.somarTempo(outroFilme);
        calculadora.somarTempo(serie);
        System.out.println("Tempo total: " + calculadora.getTempoTotal() + "minutos");

        // Criando um Filtro
        FiltroRecomendacao filtroRecomendacao = new FiltroRecomendacao();
        filtroRecomendacao.filtra(meuFilme);
        // Criando um episódio
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalAvaliacao(300);
        System.out.println("/// Classsificação Serie ///");
        System.out.println("Nome: " + serie.getNome());
        System.out.println("Episódio: " + episodio.getNumero());
        System.out.println("Total de avalaições: " + episodio.getTotalAvaliacao());
        System.out.println("Total de estrelas: " + episodio.getClassificacao() + " estrelas");
        // Avaliando o episódio da série
        filtroRecomendacao.filtra(episodio);

        // Criando um novo filme
        Filme filmeAlura = new Filme();
        filmeAlura.setDuracaoEmMinutos(200);
        filmeAlura.setNome("Dogville");
        filmeAlura.setAnoDeLancamento(2003);
        filmeAlura.avaliar(7.5);


        // Criando uma Lista, que vai armazenar objetos do tipo Filme
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeAlura);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme de lista: " + listaDeFilmes.get(0).getNome());


    }
}