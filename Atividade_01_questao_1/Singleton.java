package Atividade_01_questao_1;

public class Singleton {
    private int data;
    //private int val;
    private static Singleton instancia;
    
    private Singleton(){
    
    }
    
    public static synchronized Singleton getInstance(){ // faz o singleton funcionar
        if(instancia ==  null){
            instancia = new Singleton();
        }
        return instancia;
    }
    public void operation(){
        System.out.println("Operaçao");
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
    
}
