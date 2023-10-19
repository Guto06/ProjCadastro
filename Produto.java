public class Produto {

    private String descrisao;
    private int id;
    private double value;
    private static int quantidade = 0;

public Produto(String new_desct, double new_valor){

    this.descrisao = new_desct ;
    this.value= new_valor;
    quantidade ++;
    this.id = quantidade;

}
public String getdescription(){
    return descrisao;
}

public void setdescrisao(String description){
    this.descrisao = description;
}

public int getid(){
    return id;
}

public void setid(int id){
    this.id = id;
}

public double getvalue(){
    return value;
}

public void setvalue(double valor){
    this.value = valor;
}

public int getqntd(){
    return quantidade;
}
public void imprimirDados() {
    
}

}

