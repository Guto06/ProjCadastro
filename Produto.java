public class Produto {

    private String descrisao;
    private int id;
    private double value;
    private int quantidade;

public Produto( String description,int id, double valor, int qntd){
    this.descrisao = description ;
    this.id=id;
    this.value= valor;
    this.quantidade=qntd;

}
public String getdescription(){
    return descrisao;
}

void String setdescription(String descrisao){
    this.descrisao = description;
}

public int getid(){
    return id;
}

void int setid(int id){
    this.id = id;
}

public double getvalue(){
    return value;
}

void double setvalue(double valor){
    this.value = valor;
}

public int getqntd(){
    return quantidade;
}

void int setqntd(int qntd){
    this.quantidade = qntd;
}



}

