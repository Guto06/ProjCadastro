//import java.util.Scanner;
//import java.util.Arrays;
// import javax.management.modelmbean.DescriptorSupport;

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
}
