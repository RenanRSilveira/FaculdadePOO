package Faculdade_POO.Ex6;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor();
        vendedor.solicitarDados();
        vendedor.exibirDados();
    }
}

abstract class Pessoa {

    private String nome, endereco, telefone;

    public abstract void solicitarDados();

    public abstract void exibirDados();

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

}

class Fornecedor extends Pessoa {

    private String CNPJ;
    private double valorCredito, valorDivida;

    @Override
    public void solicitarDados() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--Fornecedor--");
        System.out.println("Nome: ");
        setNome(scanner.nextLine());
        System.out.print("Digite o endereço: ");
        setEndereco(scanner.nextLine());
        System.out.print("Digite o telefone: ");
        setTelefone(scanner.nextLine());
        System.out.print("Digite o CNPJ: ");
        CNPJ = scanner.nextLine();
        System.out.print("Digite o valor de crédito: ");
        valorCredito = scanner.nextDouble();
        System.out.print("Digite o valor da dívida: ");
        valorDivida = scanner.nextDouble();
        scanner.close();
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("CNPJ: " + CNPJ);
        System.out.println("Valor de Crédito: " + valorCredito);
        System.out.println("Valor da Dívida: " + valorDivida);
        System.out.println("Saldo: " + obterSaldo());
    }

    public double obterSaldo() {
        return valorCredito - valorDivida;
    }

}

class Empregado extends Pessoa {
    private String CPF, nomeSetor;
    private double salario, imposto;

    @Override
    public void solicitarDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--Fornecedor--");
        System.out.println("Nome: ");
        setNome(scanner.nextLine());
        System.out.print("Digite o endereço: ");
        setEndereco(scanner.nextLine());
        System.out.print("Digite o telefone: ");
        setTelefone(scanner.nextLine());
        System.out.println("CPF: ");
        CPF = scanner.nextLine();
        System.out.println("Setor: ");
        nomeSetor = scanner.nextLine();
        System.out.println("Salário: ");
        salario = scanner.nextDouble();
        System.out.println("Imposto: ");
        imposto = scanner.nextDouble();
        scanner.close();
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("CPF: " + CPF);
        System.out.println("Setor: " + nomeSetor);
        System.out.println("Salário: " + salario);
        System.out.println("Imposto: " + imposto);
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public String getNomeSetor() {
        return nomeSetor;
    }

    public void setNomeSetor(String nomeSetor) {
        this.nomeSetor = nomeSetor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

}

class Vendedor extends Empregado {

    private double valorVendas, comissao;

    @Override
    public void solicitarDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        setNome(scanner.nextLine());
        System.out.print("Digite o endereço: ");
        setEndereco(scanner.nextLine());
        System.out.print("Digite o telefone: ");
        setTelefone(scanner.nextLine());
        System.out.print("Digite o CPF: ");
        setCPF(scanner.nextLine());
        System.out.print("Digite o nome do setor: ");
        setNomeSetor(scanner.nextLine());
        System.out.print("Digite o salário: ");
        setSalario(scanner.nextDouble());
        System.out.print("Digite o imposto (em porcentagem): ");
        setImposto(scanner.nextDouble());
        System.out.print("Digite o valor das vendas: ");
        valorVendas = scanner.nextDouble();
        System.out.print("Digite a comissão (em porcentagem): ");
        comissao = scanner.nextDouble();
        scanner.close();

    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("CPF: " + getCPF());
        System.out.println("Nome do Setor: " + getNomeSetor());
        System.out.println("Salário Base: " + getSalario());
        System.out.println("Imposto: " + getImposto() + "%");
        System.out.println("Valor de Vendas: " + valorVendas);
        System.out.println("Comissão: " + comissao + "%");
        System.out.println("Salário Líquido: " + calcularSalario());

    }

    public double calcularSalario() {
        double salarioLiquido = getSalario() - getImposto() + (comissao * valorVendas);
        return salarioLiquido;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

}