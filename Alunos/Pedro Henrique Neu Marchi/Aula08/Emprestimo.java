import java.time.LocalDate;

public class Emprestimo {
    
    Leitor leitor;
    Item item;
    LocalDate dataEmprestimo;
    int diasDevolucao;
    boolean devolvido;

    public LocalDate calcularDataDevolucao() {
        return dataEmprestimo.plusDays(diasDevolucao);
    }
     public void exibirEmprestimo() {
        System.out.println("\n--- Empréstimo ---");
        leitor.apresentar();
        item.exibirInfo();

        System.out.println("Data empréstimo: " + dataEmprestimo);
        System.out.println("Data devolução: " + calcularDataDevolucao());
        if (devolvido) {
            System.out.println("Status: Devolvido");
        } else {
            System.out.println("Status: Pendente");
        }
    }
}