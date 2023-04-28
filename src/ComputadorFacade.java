public class ComputadorFacade {

    public static boolean verificarComponentes(Computador computador) {
        if (Processador.getInstancia().verificarComputadorSemComponente(computador)) {
            return false;
        }
        if (Estoque.getInstancia().verificarComputadorSemComponente(computador)) {
            return false;
        }
        if (Processador.getInstancia().verificarComputadorSemComponente(computador)) {
            return false;
        }
        if (MemoriaRam.getInstancia().verificarComputadorSemComponente(computador)) {
            return false;
        }
        return true;
    }
}