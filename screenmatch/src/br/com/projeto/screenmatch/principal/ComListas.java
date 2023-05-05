package br.com.projeto.screenmatch.principal;

import br.com.projeto.screenmatch.model.Filme;
import br.com.projeto.screenmatch.model.Serie;
import br.com.projeto.screenmatch.model.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("Homem Aranha 4", 2020);
        meuFilme.avalia(8);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(9);
        var filmeDavi = new Filme("Velozes e furiosos", 2002);
        filmeDavi.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        List<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeDavi);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item);
            if(item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificacao: " + filme.getClassificacao());
            }
        }
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Tobey Maguire ");
        buscaPorArtista.add("Kirsten Dust ");
        buscaPorArtista.add("Paul Walker ");
        buscaPorArtista.add("Vin Diesel");
        buscaPorArtista.add("Adam Sandler");
        System.out.println("Nome dos artistas: " + buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Nome dos artistas: " + buscaPorArtista);

        Collections.sort(lista);
        System.out.println("lista ordenada: " + lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenado por ano ");
        System.out.println(lista);
    }
}
