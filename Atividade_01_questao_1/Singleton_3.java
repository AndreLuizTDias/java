package Atividade_01_questao_1;


public class Singleton_3 {
    private int data;
    //private int val;
    private static Singleton_3 instancia;
    
    private Singleton_3(){
    
    }
    
    public static synchronized Singleton_3 getInstance(){ // faz o singleton funcionar
        if(instancia ==  null){
            instancia = new Singleton_3();
        }
        return instancia;
    }
    public void operation(){
        System.out.println("operaçao Singleton_3");
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
