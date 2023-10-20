import java.time.LocalDate;

public class Perecivel extends Produto {
    private int[] validade; // Representa um vetor que contém o dia, mês e ano

    protected LocalDate obterDataAtual() {
        return LocalDate.now();
    }

    public Perecivel(String description, double valor, int dia, int mes, int ano) {
        super(description, valor);
        this.validade = new int[]{dia, mes, ano}; // Inicializa o vetor validade
    }

    public boolean estaVencido() {
        // Obtém a data atual
        LocalDate dataAtual = obterDataAtual();

        // Compara a data de validade com a data atual
        if (validade[2] < dataAtual.getYear()) {
            return true;
        } else if (validade[2] == dataAtual.getYear()) {
            if (validade[1] < dataAtual.getMonthValue()) {
                return true;
            } else if (validade[1] == dataAtual.getMonthValue()) {
                return validade[0] < dataAtual.getDayOfMonth();
            }
        }

        return false;
    }

    public void imprimirDados() {
        super.imprimirDados(); // Chama o método imprimirDados da superclasse Produto

        System.out.println("Data de Validade: " + validade[0] + "-" + validade[1] + "-" + validade[2]);

        if (estaVencido()) {
            System.out.println("\nProduto vencido.");
        } else {
            System.out.println("Produto não esta vencido.");
        }
    }

    public void aplicarDesconto() {
        // Aplica desconto de 15% ao produto
        if(!estaVencido()){
        double novoValor = getValor() * 0.85;
        System.out.println("\nO valor após o desconto de 15%: R$"+ novoValor);
        setValor(novoValor);
        } else
         System.out.println("Não há descontos para produtos fora da validade!");
        
    }
}
