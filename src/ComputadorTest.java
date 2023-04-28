import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputadorTest {

    @Test
    void deveRetornarSemComponenteEstoque() {
        Computador computador = new Computador();
        Estoque.getInstancia().addComputadorSemComponente(computador);

        assertEquals(false, computador.vender());
    }

    @Test
    void deveRetornarSemComponenteProcessador() {
        Computador computador = new Computador();
        Processador.getInstancia().addComputadorSemComponente(computador);

        assertEquals(false, computador.vender());
    }

    @Test
    void deveRetornarSemComponenteMemoriaRam() {
        Computador computador = new Computador();
        MemoriaRam.getInstancia().addComputadorSemComponente(computador);

        assertEquals(false, computador.vender());
    }

    @Test
    void deveRetornarComputadorSemPendenciaFormatura() {
        Computador computador = new Computador();

        assertEquals(true, computador.vender());
    }

}