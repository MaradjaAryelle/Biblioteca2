package br.edu.fescfafic.biblioteca.Main;
import br.edu.fescfafic.biblioteca.Model.*;

import java.time.LocalDate;

class MainProjeto {

    public static void main(String[] args) {

        Impresso impresso1 = new Impresso(
                "Livro",
                "001",
                "Diego Gadelha",
                "2018",
                true,
                "3º",
                "Romance",
                "Aventuras de Diego",
                "357"
        );

        Impresso impresso2 = new Impresso(
                "Livro",
                "002",
                "Dawyla Maria",
                "2019",
                false,
                "1º",
                "Romance",
                "Aventuras de Dawyla",
                "360"
        );

        Impresso impresso3 = new Impresso(
                "Revista",
                "003",
                "Aryelle",
                "2022",
                true,
                "17º",
                "Moda",
                "Aryelle em Paris",
                "30"
        );

        Impresso impresso4 = new Impresso(
                "Livro",
                "004",
                "Luís",
                "2021",
                false,
                "7º",
                "Suspense",
                "Aventuras de Luís",
                "177"
        );

        ObraVisual quadroPintado = new ObraVisual(
                "Quadro",
                "005",
                "Aryelle",
                "2017",
                false,
                true
        );

        ObraVisual escultura = new ObraVisual(
                "Escultura",
                "006",
                "Diego Aleijadinho",
                "2019",
                false,
                true
        );
        Contato contato = new Contato("8383237243", "hsus@jxdjdn.com");

        Pessoa atendente = new Atendente(20220302), contato  , "F");
        Animal cachorro = new Cachorro ("Sushi", 3, "F");
        Animal animalSelvagem = new AnimalSelvagem("Shoyo", 0, "M");

        Atendente atendente1 = new Atendente(22/10/2022, "bhzbz", "");

        Atendente atendente2 = new Atendente(
                "Luís",
                "252.890.432-78",
                "54.098.333.4"
        );

        Bibliotecario bibliotecario1 = new Bibliotecario(
                "Dawyla",
                "890.543.342-21",
                "56.098.543-5",
                "00020304"
        );

        Bibliotecario bibliotecario2 = new Bibliotecario(
                "Diego",
                "790.543.342-22",
                "90.098.543-6",
                "11030201"
        );

        Leitor leitor1 = new Leitor(
                "Diego",
                24,
                "790.543.342-21",
                "90.098.543-5",
                true,
                00.0
        );

        Leitor leitor2 = new Leitor(
                "Dawyla",
                18,
                "890.543.342-22",
                "56.098.543-6",
                true,
                00.0
        );

        Leitor leitor3 = new Leitor(
                "Aryelle",
                25,
                "098.678.543-85",
                "03.106.103-7",
                false,
                50.75
        );

        Leitor leitor4 = new Leitor(
                "Luís",
                19,
                "252.890.432-79",
                "54.098.333.5",
                true,
                00.0
        );

        bibliotecario1.getCrb();
        bibliotecario1.setCrb("0002030d");
        bibliotecario1.getCrb();

        leitor1.cadastrarLeitores(leitor1);
        leitor2.cadastrarLeitores(leitor2);
        leitor3.cadastrarLeitores(leitor3);
        leitor4.cadastrarLeitores(leitor4);

        leitor1.setCadastroLiberado(false);
        leitor1.getCadastroLiberado();

        quadroPintado.getDisponivel();
        quadroPintado.setDisponivel(true);
        quadroPintado.getExposto();
        quadroPintado.setExposto(false);

        atendente1.getNome();
        atendente1.setNome("Maradja");
        atendente1.getNome();

        impresso1.adicionarAcervoDigital(impresso1);
        impresso2.adicionarAcervoDigital(impresso2);
        impresso3.adicionarAcervoFisico(impresso3);
        impresso4.adicionarAcervoFisico(impresso4);
        quadroPintado.adicionarAcervoPermanente(quadroPintado);
        escultura.adicionarAcervoPermanente(escultura);

        Emprestimo emprestimo = new Emprestimo(
                LocalDate.of(2023, 3, 9),
                LocalDate.of(2023, 3, 18),
                leitor1
                );

        emprestimo.adicionarObra(impresso4);
        double multa = emprestimo.devolucao(impresso4);

        System.out.println(multa);

        if (multa > 0){
            System.out.printf("Voce precisa pagar: %.2f reais", multa);
        }

    }

}
