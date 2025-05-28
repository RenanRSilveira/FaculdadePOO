package Classes;

import java.time.LocalDate;

public class Locacao {
    private Cliente cliente;
    private Veiculo veiculo;
    private LocalDate dataLocacao;
    private int diasLocado;
    private float  valorTotalLocacao;

    public Locacao(){
        this.cliente = null;
        this.veiculo = null;
        this.dataLocacao = null;
        this.diasLocado = 0;
        this.valorTotalLocacao = 0;
    }

    public void addCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public void alocar(LocalDate dataLocacao, int diasLocacao) throws Exception{
        if (this.cliente == null) {
            throw new Exception("Nenhum cliente foi adicionado para esta locação.");
        }
        if (this.veiculo == null) {
            throw new Exception("Nenhum veículo foi adicionado para esta locação.");
        }
        if (this.veiculo.isAlocado()) {
            throw new Exception("O veículo já está alocado.");
        }
        this.dataLocacao = dataLocacao;
        this.diasLocado = diasLocacao;
        this.veiculo.setAlocado(true);
        this.valorTotalLocacao = this.veiculo.getDiaria() * this.diasLocado;
    }

    public void devolucao() throws Exception{
        if (this.veiculo == null) {
            throw new Exception("Não há veículo vinculado a esta locação.");
        }
        if(this.veiculo.isAlocado()){
        this.veiculo.setAlocado(false);
    } else {
        throw new Exception("O veículo não está alocado");
        }            
    }

    @Override
    public String toString() {
        return "==== Dados da Locação ====\n" +
                "Cliente: " + (cliente != null ? cliente.getNome() : "Nenhum") + "\n" +
                "Veículo: " + (veiculo != null ? veiculo.getModelo() + " - " + veiculo.getPlaca() : "Nenhum") + "\n" +
                "Data da Locação: " + (dataLocacao != null ? dataLocacao : "Não definida") + "\n" +
                "Dias Locados: " + diasLocado + "\n" +
                "Valor Total: R$" + String.format("%.2f", valorTotalLocacao) + "\n";
    }

    public void addVeiculo(Veiculo veiculo){
        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public LocalDate getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(LocalDate dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public int getDiasLocado() {
        return diasLocado;
    }

    public void setDiasLocado(int diasLocado) {
        this.diasLocado = diasLocado;
    }

    public float getValorTotalLocacao() {
        return valorTotalLocacao;
    }

    public void setValorTotalLocacao(int valorTotalLocacao) {
        this.valorTotalLocacao = valorTotalLocacao;
    }

    
    


}
