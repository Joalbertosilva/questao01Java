package entidades;

public class Pessoa {
    private String nome;
    private String cor;
    private int idade;
    private String genero;
    private double altura;

    public Pessoa(String nome, String cor, int idade, String genero, double altura){
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
        this.genero = genero;
        this.altura = altura;

    }
    public Pessoa(){

    }

    public void pensar(boolean valor){
        if (valor){
            System.out.println(getNome() + " esta pensando");
        } else{
            System.out.println(getNome() + " não esta pensando");
        }
    }
    public void falar(boolean valor){
        if (valor){
            System.out.println(getNome() + " esta falando");
        } else{
            System.out.println(getNome() + " não esta falando");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


}
