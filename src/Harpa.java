public class Harpa extends Instrumentos implements TrocarCorda{

    public Harpa(String nome, String materal, int quantidade) {
        super(nome, materal, quantidade);
    }
    @Override
    public void tocar() {
        System.out.println("tocou uma musica na harpa");
    }
    @Override
    public void afinar() {
        System.out.println("Afinou a harpa");
    }
    @Override
    public void trocarCorda() {
        System.out.println("trocou a corda da harpa");
    }
}
