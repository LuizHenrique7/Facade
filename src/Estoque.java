public class Estoque extends Setor {

    private static Estoque biblioteca = new Estoque();

    private Estoque() {};

    public static Estoque getInstancia() {
        return biblioteca;
    }
}
