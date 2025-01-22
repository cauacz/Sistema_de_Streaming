package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

// Calculadora para somar o tempo total para ver todos os filmes que forem incluidos na coleção de "assistir mais tarde"
public class CalculadoraTempo {
    private int tempoTotal;

    // Apenas o método get é necessário, pois o método set não faz sentido para essa classe
    public int getTempoTotal() {
        return tempoTotal;
    }

    /*
    Método para somar o tempo dos filmes na lista
      public void somarTempo(Filme f){
          tempoTotal += f.getDuracaoEmMinutos();
      }
      Método para somar o tempo das series na lista
      public void somarTempo(Serie s){
          tempoTotal += s.getDuracaoEmMinutos();
      }
   */

    // Exemplo de polimorfismo: pode-se chamar esse objeto de
    // varias formas, seja serie ou filme ou próprio titulo.
    public void somarTempo(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
        // titulo.getDuracaoEmMinutos() não chama o método da classe Titulo
        // É só uma referência. Ele chama o método da subclasse específica
        // Se for uma série, ele usa o cálculo de série; se for um filme,
        // ele usa o cálculo de filme.
    }
}
