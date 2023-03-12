package Facade;


public class Financeiro {
public void RegistrarSalario(Cantor c){
        String s = String.format("Salario do cantor (%s) emitido com sucesso.", c.getNome());
        System.out.println(s);
    }
}
