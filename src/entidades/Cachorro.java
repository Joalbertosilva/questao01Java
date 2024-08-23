package entidades;

public class Cachorro {
    private String nome;
    private int idade;
    private double preco;
    private String raca;
    private double peso;

    public Cachorro(){}
    public Cachorro(String nome, int idade, double preco, String raca, double peso){
        this.nome = nome;
        this.idade = idade;
        this.preco = preco;
        this.raca = raca;
        this.peso = peso;
    }
    public void comprarCachorro (double valor){
        if (valor == getPreco()){
            System.out.println("O cachorro da raça " + getRaca() + " foi vendido");
        } else {
            System.out.println("A compra não foi aceita");
        }
    }
    public void latir (boolean valor){
        if (valor){
            System.out.println(this.nome + " esta latindo");
        } else{
            System.out.println(getNome() + " não esta latindo");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

}
