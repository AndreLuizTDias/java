package Facade;


public class Marketing {
public void divulgar(Cantor c){
        String s = String.format("Cantor (%s) Divulgado com sucesso.", c.getNome());
        System.out.println(s);
    }
}
