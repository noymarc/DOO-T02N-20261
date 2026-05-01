import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Leitor l1 = new Leitor();
        l1.nome = "João";
        l1.cpf = "111";
        l1.email = "joao@email.com";

        Leitor l2 = new Leitor();
        l2.nome = "Maria";
        l2.cpf = "222";
        l2.email = "maria@email.com";

        Livro livro = new Livro();
        livro.titulo = "Java Básico";
        livro.ano = 2020;
        livro.autor = "Autor X";

        Revista revista = new Revista();
        revista.titulo = "Tech News";
        revista.ano = 2023;
        revista.edicao = 10;

        Emprestimo e1 = new Emprestimo();
        e1.leitor = l1;
        e1.item = livro;
        e1.dataEmprestimo = LocalDate.now();
        e1.diasDevolucao = 5;
        e1.devolvido = true;

        Emprestimo e2 = new Emprestimo();
        e2.leitor = l2;
        e2.item = revista;
        e2.dataEmprestimo = LocalDate.now();
        e2.diasDevolucao = 7;
        e2.devolvido = false;

        biblioteca.adicionarEmprestimo(e1);
        biblioteca.adicionarEmprestimo(e2);

        biblioteca.listarPendentes();
    }
}