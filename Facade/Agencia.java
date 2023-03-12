package Facade;


public class Agencia {
    public void cadastrar(Cantor c){
        Facade fac = new Facade();
        fac.cadastrar(c);
    }
    
    public static void main(String[] args){
        Agencia a = new Agencia();
        
        a.cadastrar(new Cantor("Andre"));
    }
    
}
