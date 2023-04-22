package br.edu.fescfafic.biblioteca.Model;

import java.util.Date;
import java.util.UUID;

abstract class Pessoa {
    public UUID id;

    public DadosPessoais dadosPessoais;

    public Date cadastradoEm;

    public static Contato contato;

    public Endereco endereco;

    public Pessoa(Date cadastradoEm, Contato contato, Endereco endereco, DadosPessoais dadosPessoais) {
        this.id = UUID.randomUUID();
        this.dadosPessoais = dadosPessoais;
        this.cadastradoEm = cadastradoEm;
        this.contato = contato;
        this.endereco = endereco;
    }

    public Pessoa(Date cadastradoEm, UUID id, Contato contato, Endereco endereco) {

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getCadastradoEm() {
        return cadastradoEm;
    }

    public void setCadastradoEm(Date cadastradoEm) {
        this.cadastradoEm = cadastradoEm;
    }

    public static Contato getContato() {
        return contato;
    }

    public static void setContato(Contato contato) {
        Pessoa.contato = contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", dadosPessoais=" + dadosPessoais +
                ", cadastradoEm=" + cadastradoEm +
                ", endereco=" + endereco +
                '}';
    }
}
