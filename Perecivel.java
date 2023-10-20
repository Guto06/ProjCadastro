import java.text.DecimalFormat;
import java.time.LocalDate;

public class Perecivel extends Produto {
    private int[] validade; // Representa um vetor que contém o dia, mês e ano

    protected LocalDate obterDataAtual() {
        return LocalDate.now(); // retorna a data em tempo real
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
            
        } else if (validade[2] == dataAtual.getYear()) { // compara os meses
            if (validade[1] < dataAtual.getMonthValue()) {
                return true;
            } else if (validade[1] == dataAtual.getMonthValue()) {
                return validade[0] < dataAtual.getDayOfMonth();  // compara os dias
            }
        }

        return false;  // retorna falso caso esta no prazo de validade
    }

    // imprimi os dados do produto perecivel
    public void imprimirDados() {
        super.imprimirDados(); // Chama o método imprimirDados da superclasse Produto
        System.out.println("Data de Validade: " + validade[0] + "-" + validade[1] + "-" + validade[2]);

        if (estaVencido()) {
            System.out.println("\nProduto passou da validade.");
        } else {
            System.out.println("Produto esta na validade.");
        }
    }

    // aplica um desconto de 15% no produto caso esteja na validade
    public void aplicarDesconto() {
        // Aplica desconto de 15% ao produto
        if(!estaVencido()){
        double newDescount = getValor() * 0.15;
        double novoValor = getValor() * 0.85;

        DecimalFormat df = new DecimalFormat("#.00"); // Padrão para duas casas decimais

        System.out.println("\nO valor do desconto é de: "+ df.format(newDescount));
        //setValor(newDescount);
        System.out.println("O valor após o desconto de 15%: R$"+ df.format(novoValor));
        setValor(novoValor);
        } else
         System.out.println("Não há descontos para produtos fora da validade!");
        
    }
}
