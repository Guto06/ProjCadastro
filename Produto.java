import java.text.DecimalFormat;

public class Produto {
    private String descricao;
    private int id;
    private double valor;
    private static int quantidade = 0;

    public Produto(String new_descricao, double new_valor) {
        this.descricao = new_descricao;
        this.valor = new_valor;
        quantidade++; // aumenta a quantidade de produtos conforme eles forem criados
        this.id = quantidade;  // o ID do produto será o seu número de criação
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public static int getQntd() {
        return quantidade;
    }

    // imprime os dados do produto
    public void imprimirDados() {
        DecimalFormat df = new DecimalFormat("#.00"); // Padrão para duas casas decimais
        System.out.println("\nNome do produto: " + this.descricao);
        System.out.println("Valor: R$" + df.format(this.valor));
        System.out.println("ID: " + this.id);
    }

}
