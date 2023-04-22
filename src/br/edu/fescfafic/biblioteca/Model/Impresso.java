package br.edu.fescfafic.biblioteca.Model;

public class Impresso extends Acervo {

    public String edicao;
    public String genero;
    public String nomeDaObra;
    public String quantidadeDePaginas;


    public Impresso(String tipo, String codigoIdentificador, String autor, String ano, boolean disponivel, String edicao,
                    String genero, String nomeDaObra, String quantidadeDePaginas) {
        super(tipo, codigoIdentificador, autor, ano, disponivel);
        this.edicao = edicao;
        this.genero = genero;
        this.nomeDaObra = nomeDaObra;
        this.quantidadeDePaginas = quantidadeDePaginas;

    }

}
