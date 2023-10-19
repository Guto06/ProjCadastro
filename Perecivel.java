import java.time.LocalDate;
import java.util.Scanner;
import java.util.Arrays;
import javax.management.modelmbean.DescriptorSupport;

public class Perecivel extends Produto{

  protected LocalDate obterDataAtual(){
    return LocalDate.now();
  }

  private int[] validade; // Representa um vetor que contem o dia, mes e ano

public Perecivel(String description, double valor, int dia, int mes, int ano){

    super(description, valor);
    this.validade[0] = dia;
    this.validade[1] = mes;
    this.validade[2] = ano;

}

    public boolean estaVencido(){
        //obtém a data atual
    int[] dataAtual = obterDataAtual();
    
}

if(estaVencido){
    true;
} else
    false;

}