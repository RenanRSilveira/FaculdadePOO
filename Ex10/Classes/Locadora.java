package Classes;

import java.util.ArrayList;
import java.util.List;

public class Locadora {
    private String nome, endereco, fone, email;
    private List<Locacao> locacoes;
    public Locadora(String nome, String endereco, String fone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.fone = fone;
        this.email = email;
        this.locacoes = new ArrayList<>();
    }

    public Locadora(){
        this.nome = this.endereco = this.fone = this.email = "";
        this.locacoes = new ArrayList<>();
    }

    public void adicionarLocacao(Locacao locacao) {
        locacoes.add(locacao);
    }

    public void listarLocacoes() {
        System.out.println("==== Lista de Locações ====");
        for (Locacao loc : locacoes) {
            System.out.println(loc);
        }
    }

    public void exibirDados() {
        System.out.println("==== Dados da Locadora ====");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + fone);
        System.out.println("Email: " + email);
        System.out.println("Quantidade de Locações: " + locacoes.size());
    }


    @Override
    public String toString() {
        return "Locadora [nome=" + nome + ", endereco=" + endereco + ", fone=" + fone + ", email=" + email
                + ", locacoes=" + locacoes + "]";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Locacao> getLocacoes() {
        return locacoes;
    }

    public void setLocacoes(List<Locacao> locacoes) {
        this.locacoes = locacoes;
    }
    
    
}
