package br.com.projeto.screenmatch.principal;

import br.com.projeto.screenmatch.calculo.FiltroRecomendacao;
import br.com.projeto.screenmatch.calculo.calculadoraDeTempo;
import br.com.projeto.screenmatch.model.Episodio;
import br.com.projeto.screenmatch.model.Filme;
import br.com.projeto.screenmatch.model.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Homem aranha 4", 2020);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(6);
        meuFilme.avalia(10);

        System.out.println("Media de avaliações do filme: " + meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        //

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);

        calculadoraDeTempo calculadora = new calculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        System.out.println(calculadora.getTempoTotal());

        System.out.println(" --------------- ");
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);
        System.out.println(" ------------ ");

        Episodio episodio1 = new Episodio();
        episodio1.setNumero(1);
        episodio1.setSerie(lost);
        episodio1.setTotalVisualizacoes(300);
        filtro.filtra(episodio1);

        var filmedodavi = new Filme("Velozes e furiosos", 2002);
        filmedodavi.setDuracaoEmMinutos(200);
        filmedodavi.avalia(10);

        System.out.println("------------------------------");

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmedodavi);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println(" O tamanho da lista: " + listaDeFilmes.size());
        System.out.println(" O nome do primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println("toString " + listaDeFilmes.get(0).toString());



    }
}
