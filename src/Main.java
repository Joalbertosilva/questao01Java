
import entidades.Pessoa;
import entidades.Cachorro;
public class Main {
    public static void main(String[] args) {
        Pessoa novaPessoa = new Pessoa();
        novaPessoa.setNome("Joao");
        novaPessoa.pensar(false);
        Cachorro novoCachorro = new Cachorro();
        novoCachorro.setRaca("Labrador");
        novoCachorro.setPreco(500.00);
        novoCachorro.comprarCachorro(500.00);
    }
}