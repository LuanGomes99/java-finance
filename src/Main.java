import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nomeCliente = "Luan Gomes";
        String contaCliente = "Corrente";
        double saldoCliente = 1000;

        int menuCliente;
        double depositoValor;
        double saqueValor;

        Scanner scanner = new Scanner(System.in);

        String mensagemExtrato = """
        ================================
            ** Extrato Bancário ** 🧾🏦
        ================================
        
        🧑‍💼 Cliente:    %s
        🏷️ Conta:      %s
        💵 Saldo:      R$ %.2f
        """.formatted(nomeCliente, contaCliente, saldoCliente);

        String menuOperacoes = """
        
        ================================
                  ** Menu ** 🏦
        ================================
        
        1️⃣  - CONSULTAR SALDO 💰
        2️⃣  - DEPOSITAR ➕
        3️⃣  - SACAR ➖
        4️⃣  - SAIR 🚪

        ================================
        ESCOLHA O QUE DESEJA REALIZAR:""";

        String mensagemInicial = """
                %s
                %s""".formatted(mensagemExtrato, menuOperacoes);

        System.out.println(mensagemInicial);
        menuCliente = scanner.nextInt();

        String depositarCliente = """
        ================================
            ** Depósito em Conta ** ➕💵
        ================================
        
           Digite o valor do depósito:
        ================================""";

        String saqueCliente = """
        ================================
            ** Saque em Conta ** ➕💵
        ================================
        
             Digite o valor do saque:
        ================================""";

        while (menuCliente != 4) {
            switch (menuCliente) {
                case 1:
                    System.out.printf("Seu saldo atual é: R$ %.2f%n", saldoCliente);
                    break;
                case 2:
                    System.out.println(depositarCliente);
                    depositoValor = scanner.nextDouble();

                    saldoCliente += depositoValor;
                    System.out.printf("Seu saldo atual é: R$ %.2f%n", saldoCliente);
                    break;
                case 3:
                    System.out.println(saqueCliente);
                    saqueValor = scanner.nextDouble();

                    if (saqueValor <= saldoCliente) {
                        saldoCliente -= saqueValor;
                        System.out.printf("Seu saldo atual é: R$ %.2f%n", saldoCliente);
                        break;
                    } else {
                        System.out.println("Saldo insuficiente para esse saque. Confira seu saldo atual.");
                    }
                default:
                    System.out.println("Escolha uma operação válida. Confira o menu.");
            }
            System.out.println(menuOperacoes);
            menuCliente = scanner.nextInt();
        }

        String mensagemSair = """
                ================================
                    ** Operação Finalizada ** 👋
                ================================
                
                Obrigado por utilizar nossos serviços!
                Tenha um ótimo dia! ☀️
                
                ================================
                """;

        System.out.println(mensagemSair);
    }
}
