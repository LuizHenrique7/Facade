public class MemoriaRam extends Setor {

    private static MemoriaRam memoriaram = new MemoriaRam();

    private MemoriaRam() {};

    public static MemoriaRam getInstancia() {return memoriaram;}


}
