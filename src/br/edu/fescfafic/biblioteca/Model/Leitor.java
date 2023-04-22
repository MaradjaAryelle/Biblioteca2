package br.edu.fescfafic.biblioteca.Model;
import java.util.ArrayList;
import java.util.Date;

public class Leitor extends Pessoa {
    public int idade;
    public double debito;
    public boolean cadastroLiberado;

    public ArrayList<Leitor> listaDeLeitores = new ArrayList<>();

    public Leitor(Date cadastradoEm, Contato contato, Endereco endereco, DadosPessoais dadosPessoais, int idade, double debito, boolean cadastroLiberado, ArrayList<Leitor> listaDeLeitores) {
        super(cadastradoEm, contato, endereco, dadosPessoais);
        this.idade = idade;
        this.debito = debito;
        this.cadastroLiberado = cadastroLiberado;
        this.listaDeLeitores = listaDeLeitores;
    }

    public void cadastrarLeitores(Leitor leitores){
        this.listaDeLeitores.add(leitores);
    }

    public void setCadastroLiberado(boolean status) {
        this.cadastroLiberado = status;
    }

    public void getCadastroLiberado(){
        System.out.println(this.cadastroLiberado);
    }

}
