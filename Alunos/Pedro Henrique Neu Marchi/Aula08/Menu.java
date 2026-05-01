public class Menu {
    import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar leitor");
            System.out.println("2 - Cadastrar livro");
            System.out.println("3 - Cadastrar revista");
            System.out.println("4 - Registrar empréstimo");
            System.out.println("5 - Realizar devolução");
            System.out.println("6 - Listar pendentes");
            System.out.println("7 - Demonstração");
            System.out.println("8 - Sair");
            System.out.print("Escolha: ");

            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {

                case 1:
                    Leitor l = new Leitor();
                    System.out.print("Nome: ");
                    l.nome = leitor.nextLine();
                    System.out.print("CPF: ");
                    l.cpf = leitor.nextLine();
                    System.out.print("Email: ");
                    l.email = leitor.nextLine();
                    System.out.println("Leitor cadastrado!");
                    break;

                case 2:
                    Livro livro = new Livro();
                    System.out.print("Título: ");
                    livro.titulo = leitor.nextLine();
                    System.out.print("Ano: ");
                    livro.ano = leitor.nextInt();
                    leitor.nextLine();
                    System.out.print("Autor: ");
                    livro.autor = leitor.nextLine();
                    System.out.println("Livro cadastrado!");
                    break;

                case 3:
                    Revista revista = new Revista();
                    System.out.print("Título: ");
                    revista.titulo = leitor.nextLine();
                    System.out.print("Ano: ");
                    revista.ano = leitor.nextInt();
                    System.out.print("Edição: ");
                    revista.numeroEdicao = leitor.nextInt();
                    leitor.nextLine();
                    System.out.println("Revista cadastrada!");
                    break;

                case 4:
                    System.out.println("Funcionalidade simplificada (usar demo)");
                    break;

                case 5:
                    System.out.println("Devolução não implementada ainda");
                    break;

                case 6:
                    biblioteca.listarPendentes();
                    break;

                case 7:
                    executarDemo(biblioteca);
                    break;

                case 8:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 8);

        leitor.close();
    }

    // 🔥 DEMONSTRAÇÃO
    public static void executarDemo(Biblioteca biblioteca) {

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
    
}
