import java.time.LocalDate;
import java.util.Scanner;

public class TestaProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.print("\n\n============= Menu ============\n");
            System.out.println("[1] Criar produto");
            System.out.println("[2] Criar produto perecível");
            System.out.println("[3] Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("\nDigite o nome do produto: ");
                    String nomeProduto = scanner.nextLine();
                    System.out.print("Digite o preço do produto: R$");
                    double precoProduto = scanner.nextDouble();

                    Produto produto = new Produto(nomeProduto, precoProduto);
                    produto.imprimirDados();
                    break;

                case 2:
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite o nome do produto perecível: ");
                    String nomeProdutoPerecivel = scanner.nextLine();
                    System.out.print("Digite o preço do produto perecível: R$");
                    double precoProdutoPerecivel = scanner.nextDouble();
                    scanner.nextLine(); // Limpar o buffer

                    System.out.print("Digite a primeira data (AAAA-MM-DD): ");
                    String data1Input = scanner.nextLine();
                    LocalDate data1 = LocalDate.parse(data1Input);

                    System.out.print("Digite a segunda data (AAAA-MM-DD): ");
                    String data2Input = scanner.nextLine();
                    LocalDate data2 = LocalDate.parse(data2Input);

                    if (data1.isBefore(data2)) {
                        System.out.println("\nA primeira data ocorre antes da segunda data");
                    } else if (data1.isAfter(data2)) {
                        System.out.println("\nA primeira data ocorre depois da segunda data");
                    } else {
                        System.out.println("\nAs datas são iguais");
                    }

                    Perecivel produtoPerecivel = new Perecivel(nomeProdutoPerecivel, precoProdutoPerecivel);
                    produtoPerecivel.imprimirDados();
                    produtoPerecivel.verificarValidade();
                    produtoPerecivel.aplicarDesconto();
                    produtoPerecivel.imprimirDados();
                    break;

                case 3:
                    System.out.println("\nPrograma encerrado.");
                    break;

                default:
                    System.out.println("\nOpção inválida. Por favor, escolha uma opção válida.");

            }

        } while (opcao != 3);

        scanner.close();
    }
}
