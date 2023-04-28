
import java.util.ArrayList;
import java.util.List;

public abstract class Setor {

    private List<Computador> computadorSemComponente = new ArrayList<Computador>();

    public void addComputadorSemComponente(Computador computador) {this.computadorSemComponente.add(computador);}

    public boolean verificarComputadorSemComponente(Computador computador) { return this.computadorSemComponente.contains(computador);}
}
