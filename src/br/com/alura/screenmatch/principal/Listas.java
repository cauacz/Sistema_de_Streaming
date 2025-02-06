package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1970);
        meuFilme.avaliar(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avaliar(6);
        Filme filmeAlura = new Filme("Dogville", 2003);
        filmeAlura.avaliar(10);
        Serie serie = new Serie("Prison Break", 2005);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeAlura);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(serie);

        for(Titulo item: lista){ //foreach
            System.out.println(item.getNome()); // Para cada item do tipo 'Titulo' da 'lista', serão representados

            // Filme filme = (Filme) item; // Casting: todos item é um filme
            //                   ou
            if(item instanceof Filme filme){ // se item for uma instância de Filme
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        // Ordenação de Listas:
        // - Lista de Artistas
        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Pablo Picasso");
        buscaPorArtista.add("Vincent van Gogh");
        buscaPorArtista.add("Leonardo da Vinci");
        System.out.println("Lista não ordenada: " + buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Lista ordenada: " + buscaPorArtista);

        System.out.println("Lista de Titulos ordenada:");
        Collections.sort(lista);
        System.out.println(lista);

    }
}
