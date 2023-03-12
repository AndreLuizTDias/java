package Decorator;

import java.util.HashMap;


public class PizzariaDaNona {
    
    public static void main(String[] args){
        HashMap<String, Integer> ingredientes = new HashMap();
        ingredientes.put("Massa", 10);
        ingredientes.put("Muzzarela", 20);
        ingredientes.put("Tomate", 5);
        ingredientes.put("Manjerica", 5);
        
        Pizza marguerita = new PizzaDaNona(ingredientes);
        Pizza minhaSuperMarguerita = new ExtraGrande(new BordaRecheada(new MassaIntegral(marguerita)));
        System.out.println("Minha pizza custara R$: " + minhaSuperMarguerita.preco());
        
    }
}
