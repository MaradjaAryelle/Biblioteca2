package br.edu.fescfafic.biblioteca.Model;
import java.util.ArrayList;

abstract class Acervo {

    public String tipo;
    public String codigoIdentificador;
    public String autor;
    public String ano;
    public boolean disponivel;

    public ArrayList<Acervo> listaAcervoDigital = new ArrayList<>();
    public ArrayList<Acervo> listaAcervoFisico = new ArrayList<>();
    public ArrayList<Acervo> listaAcervoPermanente = new ArrayList<>();

    public Acervo(String tipo, String codigoIdentificador, String autor, String ano, boolean disponivel){
        this.tipo = tipo;
        this.codigoIdentificador = codigoIdentificador;
        this.autor = autor;
        this.ano = ano;
        this.disponivel = disponivel;
    }
    
    public void adicionarAcervoDigital(Acervo acervo){
        this.listaAcervoDigital.add(acervo);
    }

    public void adicionarAcervoFisico(Acervo acervo){
        this.listaAcervoFisico.add(acervo);
    }

    public void adicionarAcervoPermanente(Acervo acervo){
        this.listaAcervoPermanente.add(acervo);
    }

}
