package Facade;


public class Juridico {
    public void Analisar(Cantor c){
        String s = String.format("Cantor (%s) cadastrado para analise", c.getNome());
        System.out.println(s);
    }
}
