package br.com.projeto.screenmatch.model;

import br.com.projeto.screenmatch.excecao.ErroDeConversaoDeAno;

public class Titulo implements Comparable<Titulo> {
    private String nome;
    private double incluidoNoPlano;
    private double somaDeAvaliacoes;

    private int totalDeAvaliacao;
    private int anoDeLancamento;

    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();

        if(meuTituloOmdb.year().length() > 4){
            throw new ErroDeConversaoDeAno("Não consegui converter o ano, pois esta acima de " +
                    "4 caracteres.Insira 4 caracteres apenas.");
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,3));

    }

    public String getNome() {
        return nome;
    }

    public double getIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacao(){
        return totalDeAvaliacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIncluidoNoPlano(double incluidoNoPlano) {

        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {

        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {

        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do br.com.projeto.screenmatch.model.Filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }
    public void avalia(double nota) {
        somaDeAvaliacoes += nota;
        totalDeAvaliacao++;
    }
    public double pegaMedia(){

        return somaDeAvaliacoes/totalDeAvaliacao;
    }
    @Override
    public String toString() {
        return "nome='" + nome + '\'' + ", anoDeLancamento=" + anoDeLancamento + ", " +
               "duracao " + duracaoEmMinutos;

    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
