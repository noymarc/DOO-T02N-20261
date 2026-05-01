public class Revista extends Item {
    
    int edicao;

    @Override
    public void exibirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano: " + ano);
        System.out.println("Edição: " + edicao);
    }
    
}