package Facade;


public class Adminstrativo {
    public void emitirContrato(Cantor c){
        String s = String.format("Contrato do cantor (%s) emitido com sucesso.", c.getNome());
        System.out.println(s);
    }
}
