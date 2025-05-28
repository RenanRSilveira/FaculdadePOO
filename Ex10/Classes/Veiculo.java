package Classes;
import java.time.Year;

public class Veiculo {
    private String marca, modelo, placa, classe;
    private int ano, numPortas, km;
    private float diaria;
    private boolean arCondicionado, alocado;
    public Veiculo(String marca, String modelo, String placa, int km, int ano, boolean arCondicionado,
            boolean alocado) {
        if(ano < Year.now().getValue() -3){
            throw new IllegalArgumentException("Erro: o carro não pode ter mais de 3 anos");
        }
        
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.km = km;
        this.ano = ano;
        this.arCondicionado = arCondicionado;
        this.alocado = alocado;
    
    }
    public Veiculo() {
        this.marca = this.modelo = this.placa = "";
        this.km = this.ano = 0;
        this.numPortas = 4;
        this.diaria = 0;
        this.alocado = this.arCondicionado = false;
    }

    private void definirClasseEDiaria() {
        int anoAtual = Year.now().getValue();

        if (this.numPortas != 4) {
            throw new IllegalArgumentException("Erro: Veículo deve ter 4 portas para ser aceito.");
        }

        if (this.arCondicionado) {
            if (this.ano == anoAtual) {
                this.classe = "A";
                this.diaria = 450;
            } else {
                this.classe = "B";
                this.diaria = 350;
            }
        } else {
            if (this.ano == anoAtual) {
                this.classe = "C";
                this.diaria = 250;
            } else {
                this.classe = "D";
                this.diaria = 150;
            }
        }
    } 
    
    @Override
    public String toString() {
        return "Veiculo [marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", classe=" + classe + ", ano="
                + ano + ", numPortas=" + numPortas + ", km=" + km + ", diaria=" + diaria + ", arCondicionado="
                + arCondicionado + ", alocado=" + alocado + "]";
    }
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
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getNumPortas() {
        return numPortas;
    }
    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    public int getKm() {
        return km;
    }
    public void setKm(int km) {
        this.km = km;
    }
    public float getDiaria() {
        return diaria;
    }
    public void setDiaria(float diaria) {
        this.diaria = diaria;
    }
    public boolean isArCondicionado() {
        return arCondicionado;
    }
    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }
    public boolean isAlocado() {
        return alocado;
    }
    public void setAlocado(boolean alocado) {
        this.alocado = alocado;
    }
  
}
