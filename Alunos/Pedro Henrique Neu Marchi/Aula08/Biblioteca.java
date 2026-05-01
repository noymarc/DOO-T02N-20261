public class Biblioteca {

    Emprestimo[] emprestimos = new Emprestimo[100];
    int contador = 0;   

      public void adicionarEmprestimo(Emprestimo e) {
           if (contador < 10) {
            emprestimos[contador] = e;
            contador++;
        } else {
            System.out.println("Limite de empréstimos atingido!");
        }
    }

    public void listarPendentes() {
        System.out.println("\n=== Empréstimos Pendentes ===");

        for (int i = 0; i < contador; i++) {
            if (!emprestimos[i].devolvido) {
                emprestimos[i].exibirEmprestimo();
            }
        }
    }
}