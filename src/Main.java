import br.com.alura.screenmatch.calculos.CalculadoraTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Criando um Filme
        Filme meuFilme = new Filme("O Poderoso Chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibirFichaTecnica();
        meuFilme.avaliar(8);
        meuFilme.avaliar(5);
        meuFilme.avaliar(10);
        System.out.println("Total de Avalições: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações: " + meuFilme.obterMedia());

        // Criando uma Série
        Serie serie = new Serie("Prison Break", 2005);
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
        Filme outroFilme = new Filme("Avatar", 2023);
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
        Filme filmeAlura = new Filme("Dogville", 2003);
        filmeAlura.setDuracaoEmMinutos(200);
        filmeAlura.avaliar(7.5);


        // Criando uma Lista, que vai armazenar objetos do tipo Filme
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeAlura);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size()); // .size(): tamanho da lista
        System.out.println("Primeiro filme da lista: " + listaDeFilmes.get(0).getNome()); // .get(0): pegar o elemento na posição 0

        System.out.println(listaDeFilmes); // A impressão do ArrayList irá mostrar o toString de todos os elementos(Filme)
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());




    }
}