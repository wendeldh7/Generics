import java.util.ArrayList;
import java.util.List;

public class ListaCarros<T extends Carro> {
    private List<T> carros;

    public ListaCarros() {
        carros = new ArrayList<>();
    }

    public void adicionarCarro(T carro) {
        carros.add(carro);
    }

    // outros métodos que você desejar implementar

    public List<T> getCarros() {
        return carros;
    }
}