public class Flauta extends Instrumentos{

    public Flauta(String nome, String materal, int quantidade) {
        super(nome, materal, quantidade);
    }
    @Override
    public void tocar() {
        System.out.println("tocou uma musica na flauta");
    }
    @Override
    public void afinar() {
        System.out.println("Afinou a harpa");
    }
}
