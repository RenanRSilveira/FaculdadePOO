package Faculdade_POO.Ex1;

public class App {
    public static void main(String[] args) {
        Carro gol = new Carro("VolksWagen", "Gol", "Prata", 2005);
        gol.exibirDetalhes();

    }

}

abstract class Veiculo {
    private String marca, modelo, cor;
    private int anoFabricacao;

    public Veiculo(String marca, String modelo, String cor, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
    }

    abstract void exibirDetalhes();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

}

class Carro extends Veiculo {

    public Carro(String marca, String modelo, String cor, int anoFabricacao) {
        super(marca, modelo, cor, anoFabricacao);

    }

    @Override
    void exibirDetalhes() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cor: " + getCor());
        System.out.println("Ano: " + getAnoFabricacao());
    }

}
