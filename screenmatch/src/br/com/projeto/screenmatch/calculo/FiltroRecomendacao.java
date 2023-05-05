package br.com.projeto.screenmatch.calculo;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao() >= 4){
            System.out.println("Esta entre os bens classificados!");
        }else if(classificavel.getClassificacao() >= 2){
            System.out.println("Muito bem avaliado!");
        }else {
            System.out.println("Coloque na lista para ser assistido em breve!");
        }
    }
}
