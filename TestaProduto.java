import java.time.LocalDate;
import java.util.Scanner;

public class TestaProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

int opcao;

do {
            System.out.print(" \n\n ============== Menu ============\n");
            System.out.println(" [1] Criar produto");
            System.out.println("\n [2] Criar produto perecível");
            System.out.println("\n [3] Sair");
            System.out.print("\n Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("\n Digite o nome do produto: ");
                    String nomeProduto = scanner.nextLine();
                    System.out.print("\n Digite o preço do produto: R$");
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

        scanner.close();

        if (data1.isBefore(data2)) {
            System.out.println("\n A primeira data ocorre antes da segunda data");
        } else if (data1.isAfter(data2)) {
            System.out.println("\n A primeira data ocorre depois da segunda data");
        } else {
            System.out.println("As datas são iguais");

                    Perecivel produtoPerecivel = new Perecivel(nomeProdutoPerecivel, precoProdutoPerecivel);
                    produtoPerecivel.imprimirDados();
                    produtoPerecivel.verificarValidade();
                    produtoPerecivel.aplicarDesconto();
                    produtoPerecivel.imprimirDados();
                    break;
        }

                case 3:
                    System.out.println("\n Programa encerrado.");
                    break;

                default:
                    System.out.println("\n Opção inválida. Por favor, escolha uma opção válida.");

        } 

        scanner.close();
    }while (opcao != 3);
}
       
        }