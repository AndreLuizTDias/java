package Atividade_01_questao_1;


public class Singleton_1 {
    private int data;
    //private int val;
    private static Singleton_1 instancia;
    
    private Singleton_1(){
    
    }
    
    public static synchronized Singleton_1 getInstance(){ // faz o singleton funcionar
        if(instancia ==  null){
            instancia = new Singleton_1();
            System.out.println("Singleton 1 ainda nao foi instanciado");
        }
        System.out.println("Singleton 1 ja foi instanciado");
        return instancia;
    }
    public void operation(){
        System.out.println("operaçao Singleton_1");
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
