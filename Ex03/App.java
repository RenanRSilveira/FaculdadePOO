package Faculdade_POO.Ex3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Abc", "Rua 3", "3312345678", "abc@123.com");
        gerente1.exibirDados();
    }
}

abstract class Pessoa {
    private String nome, endereco, telefone, email;

    public Pessoa(String nome, String endereco, String telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    abstract void alterarDados();

    abstract void exibirDados();

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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, String endereco, String telefone, String email, double salario) {
        super(nome, endereco, telefone, email);
        this.salario = salario;

    }

    public double salarioAnual() {
        return salario * 12;
    }

    @Override
    void alterarDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Alterando dados do Funcionário: ");
        System.out.println("Nome: ");
        setNome(scanner.nextLine());
        System.out.println("Endereço: ");
        setEndereco(scanner.nextLine());
        System.out.print("Telefone: ");
        setTelefone(scanner.nextLine());
        System.out.print("Email: ");
        setEmail(scanner.nextLine());
        System.out.print("Salário: ");
        salario = scanner.nextDouble();
        scanner.close();
    }

    @Override
    void exibirDados() {
        System.out.println("Funcionário:");
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Email: " + getEmail());
        System.out.println("Salário Mensal: " + salario);
        System.out.println("Salário Anual: " + salarioAnual());
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}

class Gerente extends Pessoa {
    private double salario;
    private String setor;

    public Gerente(String nome, String endereco, String telefone, String email) {
        super(nome, endereco, telefone, email);
    }

    @Override
    void alterarDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Alterando dados do Gerente");
        System.out.println("Nome: ");
        setNome(scanner.nextLine());
        System.out.print("Endereço: ");
        setEndereco(scanner.nextLine());
        System.out.print("Telefone: ");
        setTelefone(scanner.nextLine());
        System.out.print("Email: ");
        setEmail(scanner.nextLine());
        System.out.print("Salário: ");
        salario = scanner.nextDouble();
        System.out.println("Setor: ");
        setor = scanner.nextLine();
        scanner.close();
    }

    @Override
    void exibirDados() {
        System.out.println("Gerente:");
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Email: " + getEmail());

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

}