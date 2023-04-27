public abstract class Instrumentos {

    private String nome;
    private String materal;
    private int quantidade;

    public Instrumentos(String nome, String materal, int quantidade) {
        this.nome = nome;
        this.materal = materal;
        this.quantidade = quantidade;
    }
    public abstract void tocar();
    public abstract void afinar();
}
