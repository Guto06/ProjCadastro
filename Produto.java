

public class Produto {
    public String descrisao;
    public int id;
    public double value;
    public int quantidade;

public Produto( String description,int id, double valor, int qntd){
    this.descrisao = description ;
    this.id=id;
    this.value= valor;
    this.quantidade=qntd;

}
public String getdescription(){
    return descrisao;
}
public String setdescription(String descrisao){
    this.descrisao = description;
}
public int getid(){
    return id;
}

public double getvalue(){
    return value;
}


public int getqntd(){
    return quantidade;
}
}

