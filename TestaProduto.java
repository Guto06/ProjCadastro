// import java.time.LocalDate;
import java.util.Scanner;

public class TestaProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.print("\n============= Menu ============\n");
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
                    System.out.println("\nQuantidade de produtos criados: " + Produto.getQuantidade());
                    break;

                case 2:
                    scanner.nextLine(); // Limpar o buffer

                    System.out.print("\nDigite o nome do produto: ");
                    String PerecivelNome = scanner.nextLine();
                    System.out.print("Preço do produto: R$");
                    double PerecivelValor = scanner.nextDouble();
                    System.out.print("Dia da validade: ");
                    int dia = scanner.nextInt();
                    System.out.print("Mês da validade: ");
                    int mes = scanner.nextInt();
                    System.out.print("Ano da validade: ");
                    int ano = scanner.nextInt();

                    Perecivel produtoPerecivel = new Perecivel(PerecivelNome, PerecivelValor, dia, mes, ano);

                    produtoPerecivel.imprimirDados();
                    produtoPerecivel.estaVencido();
                    produtoPerecivel.aplicarDesconto();
                    if(!produtoPerecivel.estaVencido()){
                    produtoPerecivel.imprimirDados();
                    }
                    
                    break; 

                case 3:
                    System.out.println("\nPrograma encerrado.\n ");
                    break;

                default:
                    System.out.println("\nOpção inválida. Por favor, escolha uma opção válida.");

            }

        } while (opcao != 3);

        scanner.close();
    }
}
