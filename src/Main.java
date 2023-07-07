public class Main {
    public static void main(String[] args) {
        ListaCarros<Carro> listaCarros = new ListaCarros<>();

        Honda honda = new Honda();
        Fiat fiat = new Fiat();
        Civic civic = new Civic();

        listaCarros.adicionarCarro(honda);
        listaCarros.adicionarCarro(fiat);
        listaCarros.adicionarCarro(civic);

        List<Carro> carros = listaCarros.getCarros();

        // fazer algo com a lista de carros
    }
}