import java.time.LocalDate;

import Classes.Cliente;
import Classes.Locacao;
import Classes.Locadora;
import Classes.Veiculo;

public class TestarLocadora {
    public static void main(String[] args) {
        try {
            // ==== Criando Clientes ====
            Cliente cliente1 = new Cliente("João da Silva", "12345678900", "Rua A, 123", "1199999-9999", "joao@gmail.com");
            Cliente cliente2 = new Cliente("Maria Souza", "98765432100", "Avenida B, 456", "1188888-8888", "maria@hotmail.com");

            // ==== Criando Veículos ====
            Veiculo veiculo1 = new Veiculo("Toyota", "Corolla", "ABC1A23", 50000, LocalDate.now().getYear(), true, false);
            Veiculo veiculo2 = new Veiculo("Honda", "Civic", "DEF2B34", 30000, LocalDate.now().getYear() - 1, true, false);
            Veiculo veiculo3 = new Veiculo("Fiat", "Uno", "GHI3C45", 80000, LocalDate.now().getYear(), false, false);

            // ==== Criando Locadora ====
            Locadora locadora = new Locadora("Locadora XPTO", "Av. Central, 500", "113333-4444", "contato@locadoraxpto.com");

            // ==== Criando Locação 1 ====
            Locacao locacao1 = new Locacao();
            locacao1.addCliente(cliente1);
            locacao1.addVeiculo(veiculo1);
            locacao1.alocar(LocalDate.of(2025, 5, 28), 5);

            // ==== Criando Locação 2 ====
            Locacao locacao2 = new Locacao();
            locacao2.addCliente(cliente2);
            locacao2.addVeiculo(veiculo3);
            locacao2.alocar(LocalDate.of(2025, 6, 1), 3);

            // ==== Adicionando as locações na Locadora ====
            locadora.adicionarLocacao(locacao1);
            locadora.adicionarLocacao(locacao2);

            // ==== Exibindo os dados da locadora e locações ====
            locadora.exibirDados();
            locadora.listarLocacoes();

            // ==== Fazendo devolução de um veículo ====
            System.out.println("\n--- Realizando devolução do veículo da locação 1 ---");
            locacao1.devolucao();

            // ==== Verificando se o veículo foi devolvido ====
            System.out.println("Veículo 1 está alocado? " + veiculo1.isAlocado());

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

}
