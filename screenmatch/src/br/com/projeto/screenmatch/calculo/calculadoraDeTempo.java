package br.com.projeto.screenmatch.calculo;

import br.com.projeto.screenmatch.model.Filme;
import br.com.projeto.screenmatch.model.Titulo;

public class calculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Titulo titulo){
        System.out.println("Adicionar duração em minutos " + titulo);
        this.tempoTotal = titulo.getDuracaoEmMinutos();
    }
}
