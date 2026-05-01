public class Livro extends Item {
    
    String autor;

    @Override
    public void exibirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano: " + ano);
        System.out.println("Autor: " + autor);
    }
    
}
