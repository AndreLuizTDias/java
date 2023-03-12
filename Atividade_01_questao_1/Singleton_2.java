package Atividade_01_questao_1;


public class Singleton_2 {
    private int data;
    //private int val;
    private static Singleton_2 instancia;
    
    private Singleton_2(){
    
    }
    
    public static synchronized Singleton_2 getInstance(){ // faz o singleton funcionar
        if(instancia ==  null){
            instancia = new Singleton_2();
        }
        return instancia;
    }
    public void operation(){
        System.out.println("operaçao Singleton_2");
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
