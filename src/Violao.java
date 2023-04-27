public class Violao extends Instrumentos implements TrocarCorda{

    public Violao(String nome, String materal, int quantidade) {
        super(nome, materal, quantidade);
    }
    @Override
    public void tocar() {
        System.out.println("tocou uma musica no violao");
    }
    @Override
    public void afinar() {
        System.out.println("Afinou o violao");
    }
    @Override
    public void trocarCorda() {
        System.out.println("trocou a corda do violao");
    }
}
