package Facade;


public class Auditoria {
public void agendar(Cantor c){
        String s = String.format("Auditoria do cantor (%s) agendada com sucesso.", c.getNome());
        System.out.println(s);
    }
}
