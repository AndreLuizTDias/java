
package Atividade_01_questao_1;

public class Principal {
    public static void main(String[] args){
        System.out.println("1ª chamada");
        Singleton_1.getInstance();
        System.out.println("\n2ª chamada");
        Singleton_1.getInstance();
        
        System.out.println("\nChamando os 3 Singletons diferentes");
        Singleton_1.getInstance().operation();
        Singleton_2.getInstance().operation();
        Singleton_3.getInstance().operation();
    }
}
